import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ContadorDePares {

    private static final String SEPARADORES = "[\\t\\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"']+";

    public static void main(String[] args) throws IOException {

        String nomeFicheiro = "D:/UA/1ano/2 semestre/POO/P/src/aula10/Ex1/major.txt";

        Map<String, Map<String, Integer>> pares = processarFicheiro(nomeFicheiro);
        imprimirResultado(pares);

        System.out.println("Resultado impresso no terminal.");
    }

    public static Map<String, Map<String, Integer>> processarFicheiro(String nomeFicheiro) throws IOException {
        String conteudo = new String(Files.readAllBytes(Paths.get(nomeFicheiro))).toLowerCase();
        String[] palavras = conteudo.split(SEPARADORES);

        List<String> palavrasValidas = new ArrayList<>();
        for (String palavra : palavras) {
            if (palavra.length() >= 3) {
                palavrasValidas.add(palavra);
            }
        }

        Map<String, Map<String, Integer>> pares = new TreeMap<>();

        for (int i = 0; i < palavrasValidas.size() - 1; i++) {
            String atual = palavrasValidas.get(i);
            String seguinte = palavrasValidas.get(i + 1);

            pares.putIfAbsent(atual, new TreeMap<>());
            Map<String, Integer> mapaInterno = pares.get(atual);
            mapaInterno.put(seguinte, mapaInterno.getOrDefault(seguinte, 0) + 1);
        }

        return pares;
    }

    public static void imprimirResultado(Map<String, Map<String, Integer>> pares) {
        for (Map.Entry<String, Map<String, Integer>> entrada : pares.entrySet()) {
            StringBuilder linha = new StringBuilder();
            linha.append(entrada.getKey()).append("={");

            List<String> paresTexto = new ArrayList<>();
            for (Map.Entry<String, Integer> par : entrada.getValue().entrySet()) {
                paresTexto.add(par.getKey() + "=" + par.getValue());
            }

            linha.append(String.join(", ", paresTexto)).append("}");
            System.out.println(linha.toString());
        }
    }
}