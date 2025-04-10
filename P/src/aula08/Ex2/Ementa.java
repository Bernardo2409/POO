package aula08.Ex2;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Ementa {

    private String nome;
    private String local;
    private Map<DiaSemana, List<Prato>> pratosPorDia = new EnumMap<>(DiaSemana.class);

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
        for (DiaSemana dia : DiaSemana.values()) {
            pratosPorDia.put(dia, new ArrayList<>());
        }
    }

    public void addPrato(Prato p, DiaSemana dia) {
        pratosPorDia.get(dia).add(p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ementa: ").append(nome).append(" - ").append(local).append("\n");
        for (DiaSemana dia : DiaSemana.values()) {
            sb.append(dia).append(":\n");
            for (Prato p : pratosPorDia.get(dia)) {
                sb.append("  ").append(p).append("\n");
            }
        }
        return sb.toString();
    }

    public enum DiaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
    }

    

}
