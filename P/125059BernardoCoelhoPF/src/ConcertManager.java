import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class ConcertManager {

    
    private ArrayList<Concert> concertos = new ArrayList<>();

    public ConcertManager() {
    }

    //Adiciona um novo concerto ao sistema
    public void addConcert(Concert c) {

        concertos.add(c);
    }

    // Remove um concerto usando o identificador único.
    public void removeConcerto(int id) {

        concertos.remove(id);

    }

    // Obtém o concerto no sistema com base no identificador.
    public Concert getConcert(int id) {

        for(Concert c : concertos) {

            if( c.getId() == id) {
                return c;
            }
        }
        return null;

    }

    //Imprime a informação de todas as transações no sistema
    public void printAllConcerts() {

        for(Concert c : concertos) {

            System.out.println(c);
        }
    }

    // imprime no ecrã todos os concertos por mês e lucro(decrescente)
    public void sortConcertsByCost() {

    ArrayList<Concert> novalista = new ArrayList<>(this.concertos);
    HashMap<String, Integer> meses = new HashMap<>();
    meses.put("JANUARY", 1);
    meses.put("FEBRUARY", 2);
    meses.put("MARCH", 3);
    meses.put("APRIL", 4);
    meses.put("MAY", 5);
    meses.put("JUNE", 6);
    meses.put("JULY", 7);
    meses.put("AUGUST", 8);
    meses.put("SEPTEMBER", 9);
    meses.put("OCTOBER", 10);
    meses.put("NOVEMBER", 11);
    meses.put("DECEMBER", 12);

    novalista.sort((mesx, mesy) -> {
        int var4 = meses.getOrDefault(mesx.getMonth(), 1);
        int var5 = meses.getOrDefault(mesy.getMonth(), 1);
        if (var4 != var5) {
            return Integer.compare(var4, var5);
        } else {
            double var6 = this.calculateConcertCost(mesx.getId());
            double var8 = this.calculateConcertCost(mesy.getId());
            return Double.compare(var8, var6);
        }
    });
    Iterator<Concert> var3 = novalista.iterator();

      while(var3.hasNext()) {
         Concert var4 = (Concert)var3.next();
         PrintStream var10000 = System.out;
         String var10001 = String.valueOf(var4);
         var10000.println(var10001 + " | Mês: " + var4.getMonth() + " | Custo: " + this.calculateConcertCost(var4.getId()));
      }

    }

    //calcula o custo do cocerto
    public double calculateConcertCost(int var1) {
      Iterator<Concert> listac = this.concertos.iterator();

        Concert c1;
      do {
         if (!listac.hasNext()) {
            return -1.0;
         }

         c1 = (Concert)listac.next();
      } while(c1.getId() != var1);

      return (new StandardConcertProfitCalculator()).calculateConcertProfit(c1);
   }

   //Importa a informação dos concertos a partir de um ficheiro
    public void readFile(String var1) {
      try {
         BufferedReader var2 = new BufferedReader(new FileReader(var1));

         try {
            String var3 = var2.readLine();

            while((var3 = var2.readLine()) != null) {
               if (!var3.trim().isEmpty()) {
                  String[] var4 = var3.split(";");
                  if (var4.length >= 4) {
                     int var5 = Integer.parseInt(var4[0].trim());
                     double var6 = Double.parseDouble(var4[1].trim());
                     String var8 = var4[2].trim();
                     String var9 = var4[3].trim();
                     Concert var10 = new Concert(var8, var9, var6);
                     var10.setId(var5);
                     Concert var11 = this.getConcert(var5);
                     if (var11 != null) {
                        this.concertos.remove(var11);
                     }

                     this.concertos.add(var10);
                  }
               }
            }
         } catch (Throwable var13) {
            try {
               var2.close();
            } catch (Throwable var12) {
               var13.addSuppressed(var12);
            }

            throw var13;
         }

         var2.close();
      } catch (IOException var14) {
         System.out.println("Erro ao ler ficheiro: " + var14.getMessage());
      } catch (NumberFormatException var15) {
         System.out.println("Erro ao converter número: " + var15.getMessage());
      }

   }

   //Escreve a lista de concertos existentes no ConcertManager para um ficheiro
   public void writeFile(String var1) {
      try {
         BufferedWriter var2 = new BufferedWriter(new FileWriter(var1));

         try {
            var2.write("ID; Duração; Local do Concerto; Data e Hora do Início; Lucro");
            var2.newLine();
            Iterator<Concert> var3 = this.concertos.iterator();

            while(var3.hasNext()) {
               Concert var4 = (Concert)var3.next();
               String var5 = String.format("%d; %.1f; %s ; %s ; %.1f", var4.getId(), var4.getDuration(), var4.getPlace(), var4.getDateandhora(), calculateConcertCost(var4.getId()));
               var2.write(var5);
               var2.newLine();
            }
         } catch (Throwable var7) {
            try {
               var2.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }

            throw var7;
         }

         var2.close();
      } catch (IOException var8) {
         System.out.println("Erro ao gravar ficheiro: " + var8.getMessage());
      }

   }

    
    
}
