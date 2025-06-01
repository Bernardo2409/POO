package Remakeaula9.Ex1;

import java.util.HashSet;
import java.util.Set;

public class Pessoa {
    
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    Set<Pessoa> pessoasSet = new HashSet<>();

    public void addPessoa(Pessoa p) {

        pessoasSet.add(p);
    }

    public void listar() {

        for(Pessoa p : pessoasSet) {

            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", pessoasSet=" + pessoasSet + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + idade;
        result = prime * result + ((pessoasSet == null) ? 0 : pessoasSet.hashCode());
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
        Pessoa other = (Pessoa) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (idade != other.idade)
            return false;
        if (pessoasSet == null) {
            if (other.pessoasSet != null)
                return false;
        } else if (!pessoasSet.equals(other.pessoasSet))
            return false;
        return true;
    }
}
