package Lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdasDemo {
    public static void main(String[] args) {
        // String original
        String inStr = "Lambdas add power to Java";

        // 1. Converter para maiúsculas
        String outStr = Utils.stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Maiúsculas: " + outStr);

        // 2. Remover espaços
        outStr = Utils.stringOp((str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    result.append(str.charAt(i));
            }
            return result.toString();
        }, inStr);
        System.out.println("Sem espaços: " + outStr);

        // 3. Inverter string
        outStr = Utils.stringOp((str) -> new StringBuilder(str).reverse().toString(), inStr);
        System.out.println("Invertida: " + outStr);

        // 4. Ordenar array de palavras por tamanho
        String[] palavras = inStr.split(" ");
        Arrays.sort(palavras, Comparator.comparing(String::length));
        System.out.println("Ordenadas por tamanho: " + Arrays.toString(palavras));

        // 5. Mostrar cada palavra (estilo funcional)
        List<String> lista = Arrays.asList(palavras);
        System.out.println("Palavras:");
        lista.forEach(p -> System.out.println("-> " + p));
    }
}
