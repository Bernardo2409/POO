package aula03;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;

public class Ex3 {
    
    public static void main(String[] args) {
        int[] dimensions = {1000, 5000, 10000, 20000, 40000, 100000};
        
        System.out.print("Collection\tOperation");
        for (int dim : dimensions) {
            System.out.printf("\t%d", dim);
        }
        System.out.println();

        printResults("ArrayList", dimensions);
        printResults("LinkedList", dimensions);
    }

    private static void printResults(String collectionType, int[] dimensions) {
        System.out.printf("%s\tAdd\t", collectionType);
        for (int dim : dimensions) {
            Collection<Integer> col = collectionType.equals("ArrayList") ? new ArrayList<>() : new LinkedList<>();
            double[] results = checkPerformance(col, dim);
            System.out.printf("\t%.2f", results[0]);
        }
        System.out.println();

        System.out.printf("%s\tSearch\t", collectionType);
        for (int dim : dimensions) {
            Collection<Integer> col = collectionType.equals("ArrayList") ? new ArrayList<>() : new LinkedList<>();
            double[] results = checkPerformance(col, dim);
            System.out.printf("\t%.2f", results[1]);
        }
        System.out.println();

        System.out.printf("%s\tRemove\t", collectionType);
        for (int dim : dimensions) {
            Collection<Integer> col = collectionType.equals("ArrayList") ? new ArrayList<>() : new LinkedList<>();
            double[] results = checkPerformance(col, dim);
            System.out.printf("\t%.2f", results[2]);
        }
        System.out.println();
    }

    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        long start, stop;
        double[] results = new double[3];

        // Measure add time
        start = System.nanoTime(); 
        for (int i = 0; i < DIM; i++) {
            col.add(i);
        }
        stop = System.nanoTime(); 
        results[0] = (stop - start) / 1e6; // convert to milliseconds

        // Measure search time
        start = System.nanoTime(); 
        for (int i = 0; i < DIM; i++) {
            int n = (int) (Math.random() * DIM);
            col.contains(n);
        }
        stop = System.nanoTime(); 
        results[1] = (stop - start) / 1e6; // convert to milliseconds

        // Measure remove time
        start = System.nanoTime(); 
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); 
        results[2] = (stop - start) / 1e6; // convert to milliseconds

        return results;
    }
}