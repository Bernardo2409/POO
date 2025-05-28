package MiniTeste_2EduardoLaranjeiro126156;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ChargeManager {
    public ArrayList<Charge> cargas;

    public ChargeManager(){
        this.cargas = new ArrayList<>();
    }

    public void addCharge(Charge c){
        cargas.add(c);
    }

    public void removeCharge(Charge c){
        cargas.remove(c);
    }    

    public Charge getCharge(int id) {
            for (Charge c : cargas) {
                if (c.getId() == id) {
                    return c;
                }
            }
            return null; 
    }

    public double calculateChargeCost(int id){
            for (Charge c : cargas) {
                if (c.getId() == id) {
                    return new StandardChargeCostCalculator().calculateChargeCost(c);
                }
            }
            return -1;
        }

    public void printAllCharges(){
            for (Charge c : cargas) {
                System.out.println(c);
            }
        }


    public void sortChargesByCost() {
        List<Charge> selecionadas = new ArrayList<>();

        for (Charge c : cargas) {
            selecionadas.add(c);
        }

        selecionadas.sort((c1, c2) -> 
            Double.compare(
                new StandardChargeCostCalculator().calculateChargeCost(c2),
                new StandardChargeCostCalculator().calculateChargeCost(c1)
            )
        );

        for (Charge c : selecionadas) {
            System.out.println(c + " | Custo: " + new StandardChargeCostCalculator().calculateChargeCost(c));
        }
}



    public void readFile(String fich) {
            try {
                Scanner scanner = new Scanner(new File(fich));

                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(";", 4);

                    if (parts.length == 4) {
                        double energia = Double.parseDouble(parts[1].trim());
                        String local = parts[2].trim();
                        String dataHoraStr = parts[3].trim();

                    
                        if (dataHoraStr.length() == 16) { 
                            dataHoraStr += ":00";
                        }

                        Charge c = new Charge(energia, local, dataHoraStr);
                        addCharge(c);
            } else {
                System.out.println("Formato do ficheiro invalido: " + line);
            }
}
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Ficheiro não encontrado: " + fich);
            }
        }

    public void writeFile(String filename){
        try {
            FileWriter fw = new FileWriter(filename); 
            PrintWriter pw = new PrintWriter(fw);

            for (Charge c : cargas) {
                pw.println(c.getId() + " ; " +
                        c.getEnergia() + " ; " +
                        c.getLocal() + " ; " +
                        c.getDataHora() + " ; " +
                        calculateChargeCost(c.getId())); 
            }

            pw.close();
            System.out.println("Ficheiro escrito com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao escrever no ficheiro: " + e.getMessage());
        }


}}
        

