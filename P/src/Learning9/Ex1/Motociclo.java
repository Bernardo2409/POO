package Learning9.Ex1;

public class Motociclo extends Veiculo{

    public enum Tipo {
        DESPORTIVO,
        ESTRADA,
    }
    private Tipo tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia, Tipo tipo) {
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Motociclo other = (Motociclo) obj;
        if (tipo != other.tipo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Motociclo [tipo=" + tipo + ", Matricula()=" + getMatricula() + ", Marca()=" + getMarca()
                + ", Modelo()=" + getModelo() + ", Potencia()=" + getPotencia() + " cv";
    }

    
    


}
