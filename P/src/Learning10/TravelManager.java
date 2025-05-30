package Learning10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;


public class TravelManager {

    List<Travel> travels;

    public TravelManager() {
        travels = new ArrayList<>();
    }

    public void addTravel(Travel t){
        for (Travel travel : travels) {
            if (travel.equals(t)){
                System.out.println("Travel já consta no manager");
                return;
            }
        }
        travels.add(t);
    }

    public void removeTravel(int id){
        Travel t = null;
        for (Travel travel : travels) {
            if (travel.getId() == id) {
                t = travel;
            }
        }
        if (t == null){
            System.out.println("Travelcom id = "+id+", não consta no manager");
        } else {
            travels.remove(t);
        }
    }

    public Travel getTravel(int id){
        for (Travel travel : travels) {
            if (travel.getId() == id) {
                return travel;
            }
        }
        System.out.println("Travel com id = "+id+", não consta no manager");
        return null;
    }

    public double calculateTravelCost(int id){
        ITravelCostCalculator st = new StandardTravelCostCalculator();
        for (Travel travel : travels) {
            if (travel.getId() == id) {
                double total = st.calculateTravelCost(travel);
                return total;
            }
        }
        System.out.println("Travel com id = "+id+", não consta no manager");
        return -1;
    }

    public void printAllTravels() {
        for (Travel travel : travels) {
            System.out.println(travel);
        }
    }

    public void sortTravelsByCost(boolean nacional) {
    ITravelCostCalculator st = new StandardTravelCostCalculator();
    List<Travel> filtered = new ArrayList<>();

    for (Travel travel : travels) {
        String[] initLocals = travel.getInitLocal().trim().split(", ");
        String paisInit = initLocals[1];
        String[] destLocals = travel.getDest().trim().split(", ");
        String paisDest = destLocals[1];

        if (nacional && paisInit.equals(paisDest)) {
            filtered.add(travel);
        } else if (!nacional && !paisInit.equals(paisDest)) {
            filtered.add(travel);
        }
    }   

    filtered.sort(Comparator.comparingDouble(st::calculateTravelCost));


    for (Travel travel : filtered) {
        System.out.println(travel + " | Custo: " + st.calculateTravelCost(travel));
    }
}

    // LER O FICHEIRO
    public void readFile(String fich){
        try{
            Scanner sc = new Scanner(new File(fich));
            sc.nextLine();
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] partes = linha.trim().split("; ");
                int id = Integer.parseInt(partes[0]);
                int dias = Integer.parseInt(partes[1]);
                String init = partes[2];
                String dest = partes[3];
                Travel t = new Travel(id, init, dest, dias);

                // VERIFICAR SE EXISTE JÁ UM ID IGUAL
                boolean found = false;
                for (int i = 0; i < travels.size(); i++) {
                    if (travels.get(i).getId() == id) {
                        travels.set(i, t);
                        found = true;
                        Travel.idCounter--;
                        break;
                    }
                }
                if (!found) { 
                    travels.add(t);
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Ficheiro não encontrado");
        }
    }


    public void writeFile(String fich){
        ITravelCostCalculator st = new StandardTravelCostCalculator();
        try{
            // STRINGBUILDER
            StringBuilder sb = new StringBuilder("ID; Dias de Viagem; Local Inicio; Destino\n");
            FileWriter fW = new FileWriter(fich);
            for (Travel travel : travels) {
                String line = travel.getId() +"; "+ travel.getInitLocal() +"; "+ travel.getDest() + "; " + travel.getDuration() + "; " + st.calculateTravelCost(travel) + "\n";
                sb.append(line);
            }
            fW.write(sb.toString());
            fW.close();
        } catch (Exception e){
            System.out.println("Caminho não encontrado");
        }
    }
}


//SORT ORDEM CRESCENTE: pela duration, tem de se criar um getDuration();

//COLLECTIONS: Collections.sort(travels, Comparator.comparingInt(Travel::getDuration));
//ou
//lambda: travels.sort((t1, t2) -> Integer.compare(t1.getDuration(), t2.getDuration()));


//SORT ORDEM DECRESCENTE: pela duration 

//travels.sort((t1, t2) -> Integer.compare(t2.getDuration(), t1.getDuration()));
// ou:
//travels.sort(Comparator.comparingInt(Travel::getDuration).reversed());


//SORT NATURAL AO SER CRIADO UM OBJETO:

//public class Travel implements Comparable<Travel> {
    // ...

//    @Override
//    public int compareTo(Travel other) {
//        return Integer.compare(this.duration, other.duration);
//    }
//}



