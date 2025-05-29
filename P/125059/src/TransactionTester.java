
public class TransactionTester {
    public static void main(String[] args) {
        TransactionManager tm = new TransactionManager();

        // ----------------------------------------------------------
        // retirei os segundos, pois estes não estão previstos no enunciado e não interferem no resultado final do exercicio
        Transaction t1 = new Transaction("Pintura interior", "2025-05-27 11:00", 5.0);
        Transaction t2 = new Transaction("Instalacao mosaicos", "2025-05-28 05:00", 15.0);
        tm.addTransaction(t1);
        tm.addTransaction(t2);
        // ----------------------------------------------------------

        tm.printAllTransactions();

        // ----------------------------------------------------------
        System.out.println(tm.getTransaction(1));
        System.out.println(tm.calculateTransactionCost(1));
        System.out.println(tm.getTransaction(2));
        System.out.println(tm.calculateTransactionCost(2));
        System.out.println(tm.getTransaction(30));              // não existe!
        System.out.println(tm.calculateTransactionCost(30));    // não existe!
        // ----------------------------------------------------------

        System.out.println("---------------");
        tm.sortTransactionsByCost();
        System.out.println("---------------");

        // ----------------------------------------------------------
        tm.readFile("D:\\UA\\1ano\\2 semestre\\POO\\P\\125059\\src\\services.txt");
        tm.printAllTransactions();

        // ----------------------------------------------------------
        System.out.println(tm.getTransaction(1));
        System.out.println(tm.calculateTransactionCost(1));
        System.out.println(tm.getTransaction(2));
        System.out.println(tm.calculateTransactionCost(2));
        System.out.println(tm.getTransaction(30));
        System.out.println(tm.calculateTransactionCost(30));
        // ----------------------------------------------------------

        tm.writeFile("D:\\UA\\1ano\\2 semestre\\POO\\P\\125059\\src\\result.txt");

        // ----------------------------------------------------------

        System.out.println("---------------");
        tm.sortTransactionsByCost();
        System.out.println("---------------");

        // ----------------------------------------------------------

    }
}
