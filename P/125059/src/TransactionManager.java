import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TransactionManager{

    ArrayList<Transaction> transactions = new ArrayList<>();   

    public void addTransaction( Transaction t) {

        transactions.add(t);

    }

    public void removeTransaction(int id) {
        Transaction toRemove = null;
        for (Transaction t : transactions) {
            if (t.getId() == id) {
                toRemove = t;
                break;
            }
        }
        if (toRemove != null) {
            transactions.remove(toRemove);
        }
    }

    public Transaction getTransaction(int id) {

        for (Transaction transaction : transactions)
            {
                if(transaction.getId() == id){   
                    
                    return transaction;
                }
            }
        return null;

    }

    public double calculateTransactionCost(int id) {
        for (Transaction t : transactions) {
                if (t.getId() == id) {
                    return new StandardTransactionCostCalculator().calculateTransactionCost(t);
                }
            }
            return -1;
        }   

    public void printAllTransactions() {

        for (Transaction transaction : transactions) {

            System.out.println(transaction);

        }

    }

    public void sortTransactionsByCost() {

    ArrayList<Transaction> copia = new ArrayList<>(transactions);

    Map<String, Integer> ordemDias = new HashMap<>();
    ordemDias.put("MONDAY", 1);
    ordemDias.put("TUESDAY", 2);
    ordemDias.put("WEDNESDAY", 3);
    ordemDias.put("THURSDAY", 4);
    ordemDias.put("FRIDAY", 5);
    ordemDias.put("SATUDAY", 6);
    ordemDias.put("SUNDAY", 7);

    copia.sort((t1, t2) -> {
        int dia1 = ordemDias.getOrDefault(t1.getDiaDaSemana(), 1);
        int dia2 = ordemDias.getOrDefault(t2.getDiaDaSemana(), 1);

        if (dia1 != dia2) {
            return Integer.compare(dia1, dia2); 
        } else {
            double custo1 = calculateTransactionCost(t1.getId());
            double custo2 = calculateTransactionCost(t2.getId());
            return Double.compare(custo2, custo1); 
        }
    });

    for (Transaction t : copia) {
        System.out.println(t + " | Dia: " + t.getDiaDaSemana() + " | Custo: " + calculateTransactionCost(t.getId()));
    }
}

    public void readFile(String fich) {
    try (BufferedReader br = new BufferedReader(new FileReader(fich))) {
        String linha = br.readLine(); 

        while ((linha = br.readLine()) != null) {
            if (linha.trim().isEmpty()) continue;

            String[] partes = linha.split(";");
            if (partes.length < 4) continue;

            int id = Integer.parseInt(partes[0].trim());
            double horas = Double.parseDouble(partes[1].trim());
            String descricao = partes[2].trim();
            String dataHora = partes[3].trim();

            Transaction nova = new Transaction(descricao, dataHora, horas);
            nova.setId(id);  

            Transaction existente = getTransaction(id);
            if (existente != null) {
                transactions.remove(existente);
            }

            transactions.add(nova);
        }
    } catch (IOException e) {
        System.out.println("Erro ao ler ficheiro: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.out.println("Erro ao converter número: " + e.getMessage());
    }
}

public void writeFile(String fich) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fich))) {
        bw.write("ID; Horas Trabalho; Descricao; Data e Hora");
        bw.newLine();

        for (Transaction t : transactions) {
            String linha = String.format("%d; %.1f; %s  ; %s",
                    t.getId(),
                    t.getHoras(),
                    t.getDescricao(),
                    t.getDataHora());
            bw.write(linha);
            bw.newLine();
        }

    } catch (IOException e) {
        System.out.println("Erro ao gravar ficheiro: " + e.getMessage());
    }
}


    

    


   

}
