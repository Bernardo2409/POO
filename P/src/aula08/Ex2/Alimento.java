package aula08.Ex2;

import java.util.Objects;

public class Alimento implements iAlimento {

    protected double proteinas;
    protected double calorias;
    protected double peso;

    public Alimento( double proteinas, double calorias, double peso) {

        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;

    }

    @Override
    public double getProteinas() {
        return proteinas * peso / 100;
    }

    @Override
    public double getCalorias() {
        return calorias * peso / 100;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(proteinas, calorias, peso);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alimento other = (Alimento) obj;
        return Double.compare(other.proteinas, proteinas) == 0 &&
               Double.compare(other.calorias, calorias) == 0 &&
               Double.compare(other.peso, peso) == 0;
    }
}

class Carne extends Alimento {

    private String variedade;

    public Carne(double proteinas, double calorias, double peso, String variedade) {

        super( proteinas, calorias, peso);
        this.variedade = variedade;
    }
    @Override
    public String toString() {
        return "Carne (" + variedade + ") - " + getPeso() + "g, " +
               getCalorias() + " cal, " + getProteinas() + "g prot";
    
        
    }
}

class Peixe extends Alimento {

    private String variedade;

    public Peixe(double proteinas, double calorias, double peso, String variedade) {

        super(proteinas, calorias, peso);
        this.variedade = variedade;

    }

    @Override
    public String toString() {
        return "Peixe (" + variedade + ") - " + getPeso() + "g, " +
               getCalorias() + " cal, " + getProteinas() + "g prot";
    }

}
class Cereal extends Alimento {

    private String nome;

    public Cereal(double proteinas, double calorias, double peso, String nome) {

        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cereal: " + nome + " - " + getPeso() + "g, " +
               getCalorias() + " cal, " + getProteinas() + "g prot";
    }
}
class Legume extends Alimento {

    private String nome;

    public Legume(double proteinas, double calorias, double peso, String nome) {

        super(proteinas, calorias, peso);
        this.nome = nome;

    }

    @Override
    public String toString() {
        return "Legume: " + nome + " - " + getPeso() + "g, " +
               getCalorias() + " cal, " + getProteinas() + "g prot";
    }

}
