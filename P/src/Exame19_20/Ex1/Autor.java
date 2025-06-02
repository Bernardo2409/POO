package Exame19_20.Ex1;

public class Autor {
    @Override
    public String toString() {
        return "[" + nome + " ("+ ano + "-)";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ano;
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
        Autor other = (Autor) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (ano != other.ano)
            return false;
        return true;
    }
    public Autor(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }
    
    private String nome;
    private int ano;
}
