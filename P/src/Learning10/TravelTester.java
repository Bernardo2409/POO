package Learning10;

public class TravelTester {
    public static void main(String[] args) {
        TravelManager tm = new TravelManager();

        // ----------------------------------------------------------
        Travel t1 = new Travel("Aveiro, Portugal", "Madrid, Spain", 5);
        Travel t2 = new Travel("Dublin, Ireland", "Cork, Ireland", 15);
        Travel t3 = new Travel("Denver, United States", "Cork, Ireland", 15);
        tm.addTravel(t1);
        tm.addTravel(t2);
        tm.addTravel(t3);
        // ----------------------------------------------------------

        tm.printAllTravels();

        // ----------------------------------------------------------
        System.out.println(tm.getTravel(1));
        System.out.println(tm.calculateTravelCost(1));
        System.out.println(tm.getTravel(2));
        System.out.println(tm.calculateTravelCost(2));
        System.out.println(tm.getTravel(30));              // não existe!
        System.out.println(tm.calculateTravelCost(30));    // não existe!
        // ----------------------------------------------------------

        System.out.println("---------------");
        System.out.println("> NATIONAL");
        System.out.println("---------------");
        tm.sortTravelsByCost(true);
        System.out.println();

        System.out.println("------------------");
        System.out.println("> INTERNATIONAL");
        System.out.println("------------------");
        tm.sortTravelsByCost(false);
        System.out.println();

        // ----------------------------------------------------------
        tm.readFile("D:\\UA\\1ano\\2 semestre\\POO\\P\\src\\Learning10\\travels.txt");

        Travel t4 = new Travel("Marselha, Franca", "Helsinquia, Finlandia", 15); //Testar ID depois de ler ficheiro
        tm.addTravel(t4);

        tm.printAllTravels();

        // ----------------------------------------------------------
        System.out.println(tm.getTravel(1));
        System.out.println(tm.calculateTravelCost(1));
        System.out.println(tm.getTravel(2));
        System.out.println(tm.calculateTravelCost(2));
        System.out.println(tm.getTravel(30));
        System.out.println(tm.calculateTravelCost(30));
        // ----------------------------------------------------------

        tm.writeFile("D:\\UA\\1ano\\2 semestre\\POO\\P\\src\\Learning10\\result.txt");

        // ----------------------------------------------------------

        System.out.println("---------------");
        System.out.println("> NATIONAL");
        System.out.println("---------------");
        tm.sortTravelsByCost(true);
        System.out.println();

        System.out.println("------------------");
        System.out.println("> INTERNATIONAL");
        System.out.println("------------------");
        tm.sortTravelsByCost(false);

        // ----------------------------------------------------------

    }
}