import java.util.List;
import java.util.ArrayList;

public class Ex3 {

    public static void main(String[] args) {
        RealEstate imobiliaria = new RealEstate();
        imobiliaria.newProperty("Glória", 2, 30000);
        imobiliaria.newProperty("Vera Cruz", 1, 25000);
        imobiliaria.newProperty("Santa Joana", 3, 32000);
        imobiliaria.newProperty("Aradas", 2, 24000);
        imobiliaria.newProperty("São Bernardo", 2, 20000);

        imobiliaria.sell(1001);
        imobiliaria.setAuction(1002, new DataYMD(21, 3, 2023), 4);
        imobiliaria.setAuction(1003, new DataYMD(1, 4, 2023), 3);
        imobiliaria.setAuction(1001, new DataYMD(1, 4, 2023), 4);
        imobiliaria.setAuction(1010, new DataYMD(1, 4, 2023), 4);

        System.out.println(imobiliaria);
    }

    public static class Property {
        private static int nextId = 1000;
        private int id;
        private int nrQuartos;
        private String localidade;
        private int preco;
        private boolean disponibilidade;
        private DataYMD inicioLeilao;
        private DataYMD fimLeilao;

        public Property(String localidade, int nrQuartos, int preco) {
            this.id = nextId++;
            this.localidade = localidade;
            this.nrQuartos = nrQuartos;
            this.preco = preco;
            this.disponibilidade = true;
            this.inicioLeilao = null;
            this.fimLeilao = null;
        }

        public int getId() {
            return id;
        }

        public boolean isDisponivel() {
            return disponibilidade;
        }

        public void setDisponibilidade(boolean disponibilidade) {
            this.disponibilidade = disponibilidade;
        }

        public void setLeilao(DataYMD inicio, int duracao) {
            this.inicioLeilao = inicio;
            this.fimLeilao = inicio.addDays(duracao);
        }
        //TP ultima
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Imóvel: ").append(id)
              .append("; quartos: ").append(nrQuartos)
              .append("; localidade: ").append(localidade)
              .append("; preço: ").append(preco)
              .append("; disponível: ").append(disponibilidade ? "sim" : "não");
            if (inicioLeilao != null && fimLeilao != null) {
                sb.append("; leilão ").append(inicioLeilao).append(" : ").append(fimLeilao);
            }
            return sb.toString();
        }
    }

    public static class RealEstate {
        private List<Property> properties;

        public RealEstate() {
            properties = new ArrayList<>();
        }

        public void newProperty(String localidade, int nrQuartos, int preco) {
            properties.add(new Property(localidade, nrQuartos, preco));
        }

        public void sell(int id) {
            Property property = findPropertyById(id);
            if (property != null) {
                if (property.isDisponivel()) {
                    property.setDisponibilidade(false);
                    System.out.println("Imóvel " + id + " vendido.");
                } else {
                    System.out.println("Imóvel " + id + " não está disponível.");
                }
            } else {
                System.out.println("Imóvel " + id + " não existe.");
            }
        }

        public void setAuction(int id, DataYMD inicio, int duracao) {
            Property property = findPropertyById(id);
            if (property != null) {
                if (property.isDisponivel()) {
                    property.setLeilao(inicio, duracao);
                } else {
                    System.out.println("Imóvel " + id + " não está disponível.");
                }
            } else {
                System.out.println("Imóvel " + id + " não existe.");
            }
        }

        private Property findPropertyById(int id) {
            for (Property property : properties) {
                if (property.getId() == id) {
                    return property;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Propriedades:\n");
            for (Property property : properties) {
                sb.append(property).append("\n");
            }
            return sb.toString();
        }
    }

    public static class DataYMD {
        private int day;
        private int month;
        private int year;

        public DataYMD(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public DataYMD addDays(int days) {
           
            return new DataYMD(day + days, month, year);
        }

        @Override
        public String toString() {
            return String.format("%04d-%02d-%02d", year, month, day);
        }
    }
}