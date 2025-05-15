package aula09.Ex1;
import aula06.Ex1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

import Learning1.Pessoa;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);
        System.out.println("ArrayList c2 contains 'Vento' ? " + c2.contains("Vento"));
        System.out.println("What is the index of 'Vento' ? " + c2.indexOf("Vento"));
        System.out.println(c2.lastIndexOf("Vento"));
        System.out.println(c2.set(1, "Sol"));
        System.out.println(c2);
        System.out.println(c2.subList(0, 1));

        Set<Pessoa> c3 = new HashSet<>();

        c3.add(new Pessoa("Pedro", 12));
        c3.add(new Pessoa("Luis", 30));
        c3.add(new Pessoa("João", 20));
        c3.add(new Pessoa("Alberto", 34));
        c3.add(new Pessoa("Joaquim", 39));

        
        System.out.println(c3);

        Iterator<Pessoa> it = c3.iterator();
        while (it.hasNext()) {
            Pessoa p = it.next();
            System.out.println(p);
        }

        


    }

}
