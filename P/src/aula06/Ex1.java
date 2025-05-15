package aula06;
import aula05.DateYMD;

public class Ex1 {

    public static class Pessoa {
        private String nome;
        private int cc;
        private DateYMD dataNasc;

        public Pessoa(String nome, int cc, DateYMD dataNasc) {
            this.nome = nome;
            this.cc = cc;
            this.dataNasc = dataNasc;
        }

        public Pessoa(String nome, int cc) {
            this.nome = nome;
            this.cc = cc;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getCc() {
            return cc;
        }

        public void setCc(int cc) {
            this.cc = cc;
        }

        public DateYMD getDataNasc() {

            return dataNasc;
        }

        public void setDataNasc(DateYMD dataNasc) {
            this.dataNasc = dataNasc;
        }

        @Override
        public String toString() {
            return nome; 
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((nome == null) ? 0 : nome.hashCode());
            result = prime * result + cc;
            result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
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
            if (cc != other.cc)
                return false;
            if (dataNasc == null) {
                if (other.dataNasc != null)
                    return false;
            } else if (!dataNasc.equals(other.dataNasc))
                return false;
            return true;
        }

    }

    public class Aluno extends Pessoa {
        private int nMec;
        private int contadorNMec = 100;
        private DateYMD dataInsc;

        public Aluno(String iNome, int iBI, DateYMD iDataNasc, DateYMD iDataInsc) {
            super(iNome, iBI, iDataNasc);
            this.nMec = contadorNMec++;
            this.dataInsc = iDataInsc;
        }

        public Aluno(String iNome, int iBI, DateYMD iDataNasc) {
            this(iNome, iBI, iDataNasc, new DateYMD(19, 3, 2025));
        }

        public int getnMec() {
            return nMec;
        }

        @Override
        public String toString() {
            return super.toString() + "; NMec: " + nMec + "; Data Inscrição: " + dataInsc;
        }
    }

    public class Professor extends Pessoa {
        private String categoria;
        private String departamento;

        public Professor(String nome, int cc, DateYMD dataNasc, String categoria, String departamento) {
            super(nome, cc, dataNasc);
            this.categoria = categoria;
            this.departamento = departamento;
        }

        public String getCategoria() {
            return categoria;
        }

        public String getDepartamento() {
            return departamento;
        }

        @Override
        public String toString() {
            return super.toString() + "; Categoria: " + categoria + "; Departamento: " + departamento;
        }
    }

    public class Bolseiro extends Aluno {
        private Professor orientador;
        private double bolsa;

        public Bolseiro(String iNome, int iBI, DateYMD iDataNasc, Professor orientador, double bolsa) {
            super(iNome, iBI, iDataNasc);
            this.orientador = orientador;
            this.bolsa = bolsa;
        }

        public Professor getOrientador() {
            return orientador;
        }

        public void setOrientador(Professor orientador) {
            this.orientador = orientador;
        }

        public double getBolsa() {
            return bolsa;
        }

        public void setBolsa(double bolsa) {
            this.bolsa = bolsa;
        }

        @Override
        public String toString() {
            return super.toString() + "; Orientador: " + orientador.getNome() + "; Bolsa: " + bolsa;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        Ex1.Aluno al = ex1.new Aluno("Andreia Melo", 9855678,
                new DateYMD(18, 7, 1990), new DateYMD(1, 9, 2018));
        Ex1.Professor p1 = ex1.new Professor("Jorge Almeida", 3467225,
                new DateYMD(13, 3, 1967), "Associado", "Informática");
        Ex1.Bolseiro b = ex1.new Bolseiro("Igor Santos", 8976543,
                new DateYMD(11, 5, 1985), p1, 900);
        b.setBolsa(1050);

        System.out.println("Aluno: " + al.getNome());
        System.out.println(al);
        System.out.println("Bolseiro: " + b.getNome() + ", NMec: "
                + b.getnMec() + ", Bolsa: " + b.getBolsa() + ", Orientador: "
                + b.getOrientador().getNome());
        System.out.println(b);
    }
}