public class ConcertTester {
    public static void main(String[] args) {
        ConcertManager cm = new ConcertManager();

        // ----------------------------------------------------------
        Concert c1 = new Concert("Madrid, Espanha", "2025-05-27 11:00", 25.0);
        Concert c2 = new Concert("Oslo, Suecia", "2025-05-28 05:00", 35.0);
        cm.addConcert(c1);
        cm.addConcert(c2);
        // ----------------------------------------------------------

        cm.printAllConcerts();

        // ----------------------------------------------------------
        System.out.println(cm.getConcert(1));
        System.out.println(cm.calculateConcertCost(1));
        System.out.println(cm.getConcert(2));
        System.out.println(cm.calculateConcertCost(2));
        System.out.println(cm.getConcert(30));              // não existe!
        System.out.println(cm.calculateConcertCost(30));    // não existe!
        // ----------------------------------------------------------

        System.out.println("---------------");
        cm.sortConcertsByCost();
        System.out.println("---------------");

        // ----------------------------------------------------------
        cm.readFile("src//classicpimba.txt");
        cm.printAllConcerts();

        // ----------------------------------------------------------
        System.out.println(cm.getConcert(1));
        System.out.println(cm.calculateConcertCost(1));
        System.out.println(cm.getConcert(2));
        System.out.println(cm.calculateConcertCost(2));
        System.out.println(cm.getConcert(30));
        System.out.println(cm.calculateConcertCost(30));
        // ----------------------------------------------------------

        cm.writeFile("src\\result.txt");

        // ----------------------------------------------------------

        System.out.println("---------------");
        cm.sortConcertsByCost();
        System.out.println("---------------");

        // ----------------------------------------------------------

    }
}
