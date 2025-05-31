package Comparator;

import java.util.*;

public class OrdenarDiasSemana {
    public static void main(String[] args) {
        // Lista simulando a leitura do ficheiro
        List<List<String>> dados = Arrays.asList(
            Arrays.asList("Segunda", "4"),
            Arrays.asList("Terça", "6"),
            Arrays.asList("Segunda", "5"),
            Arrays.asList("Quarta", "6")
        );

        // Map para guardar os dados
        Map<String, List<Integer>> mapa = new HashMap<>();

        // Preencher o mapa com os dados
        for (List<String> linha : dados) {
            String dia = linha.get(0);
            int valor = Integer.parseInt(linha.get(1));
            if (!mapa.containsKey(dia)) {
                mapa.put(dia, new ArrayList<>());
            }
            mapa.get(dia).add(valor);
        }

        // Ordem dos dias da semana
        List<String> ordemDias = Arrays.asList(
            "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"
        );

        // TreeMap com comparador personalizado
        Map<String, List<Integer>> ordenado = new TreeMap<>(Comparator.comparingInt(ordemDias::indexOf));
        ordenado.putAll(mapa);

        // Ordenar os valores de cada dia por ordem decrescente
        for (List<Integer> valores : ordenado.values()) {
            valores.sort(Comparator.reverseOrder());
        }

        // Imprimir o resultado
        for (Map.Entry<String, List<Integer>> entrada : ordenado.entrySet()) {
            for (int valor : entrada.getValue()) {
                System.out.println(entrada.getKey() + "; " + valor);
            }
        }
    }
}