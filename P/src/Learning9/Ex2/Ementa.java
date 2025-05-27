package Learning9.Ex2;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

public class Ementa{

    private String nome;
    private String local;
    private int id = 1;

    private Map<DiaSemana, ArrayList<Prato>> lista_pratos;



    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.lista_pratos = new EnumMap<>(DiaSemana.class);
        for (DiaSemana dia : DiaSemana.values()) {
            lista_pratos.put(dia, new ArrayList<>());
        }
        id = id++;
    }

    public void addPrato(Prato p, DiaSemana diaSemana) {
        lista_pratos.get(diaSemana).add(p);
    }



    public enum VariedadeCarne {
        VACA,
        PORCO,
        PERU,
        FRANGO,
        OUTRA
    }

    public enum TipoPeixe {
        CONGELADO,
        FRESCO
    }

    public enum DiaSemana {

        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO,
        DOMINGO


    }

    public String vegdieta(Prato p) {

        //se o prato for veg ou dieta.
        if( p instanceof PratoVegetariano) {
                return " - Prato Vegetariano";
        } else if ( p instanceof PratoDieta) {

            return " - Dieta (" + p.caloriasTotais() + " Calorias) ";
        }   else {
            return " ";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<DiaSemana, ArrayList<Prato>> entry : lista_pratos.entrySet()) {
            DiaSemana dia = entry.getKey();
            ArrayList<Prato> pratosDia = entry.getValue();
            for (Prato prato : pratosDia) {
                sb.append("Prato 'combinado n.").append(prato.getId())
                .append("' , composto por 2 Ingredientes")
                .append(vegdieta(prato))
                .append(", Dia ").append(dia)
                .append("\n");
            }
        }
        return sb.toString();
    }

}
