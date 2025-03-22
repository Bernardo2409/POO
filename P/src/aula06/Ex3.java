package aula06;

import java.util.HashSet;
import java.util.Set;

public class Ex3 {
    public class Conjunto {

        private Set<Integer> elementos;

    public Conjunto() {
        this.elementos = new HashSet<>();
    }

    // Insere um elemento no conjunto
    public void insert(int n) {
        elementos.add(n);
    }

    // Verifica se o conjunto contém um elemento
    public boolean contains(int n) {
        return elementos.contains(n);
    }

    // Remove um elemento do conjunto
    public void remove(int n) {
        elementos.remove(n);
    }

    // Esvazia o conjunto
    public void empty() {
        elementos.clear();
    }

    // Retorna o número de elementos no conjunto
    public int size() {
        return elementos.size();
    }

    // Combina dois conjuntos (união)
    public Conjunto combine(Conjunto add) {
        Conjunto result = new Conjunto();
        result.elementos.addAll(this.elementos);
        result.elementos.addAll(add.elementos);
        return result;
    }

    // Subtrai os elementos de outro conjunto
    public Conjunto subtract(Conjunto dif) {
        Conjunto result = new Conjunto();
        result.elementos.addAll(this.elementos);
        result.elementos.removeAll(dif.elementos);
        return result;
    }

    // Interseção de dois conjuntos
    public Conjunto intersect(Conjunto inter) {
        Conjunto result = new Conjunto();
        result.elementos.addAll(this.elementos);
        result.elementos.retainAll(inter.elementos);
        return result;
    }

    // Converte o conjunto em uma String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int el : elementos) {
            sb.append(el).append(" ");
        }
        return sb.toString().trim();
    }

    }
    
    // Teste da classe Conjunto
    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        Conjunto c1 = ex3.new Conjunto();
        c1.insert(4);
        c1.insert(7);
        c1.insert(6);
        c1.insert(5);
    
        Conjunto c2 = ex3.new Conjunto();
        int[] test = { 7, 3, 2, 5, 4, 6, 7 };
        for (int el : test) {
            c2.insert(el);
        }
        c2.remove(3);
        c2.remove(5);
        c2.remove(6);
    
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Número de elementos em c1: " + c1.size());
        System.out.println("Número de elementos em c2: " + c2.size());
        System.out.println("c1 contém 6?: " + ((c1.contains(6) ? "sim" : "não")));
        System.out.println("c2 contém 6?: " + ((c2.contains(6) ? "sim" : "não")));
        System.out.println("União: " + c1.combine(c2));
        System.out.println("Interseção: " + c1.intersect(c2));
        System.out.println("Diferença: " + c1.subtract(c2));
        c1.empty();
        System.out.println("c1: " + c1);
    }
}


