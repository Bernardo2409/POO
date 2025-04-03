package aula08.Ex1;

import java.util.ArrayList;

public class Empresa {


    private String nome;
    private String codigo_postal;
    private String email;
    protected ArrayList<Veiculo> veiculos;

    public Empresa( String nome, String codigo_postal, String email) {

        this.nome = nome;
        this.codigo_postal = codigo_postal;
        this.email = email;
        this.veiculos = new ArrayList<>();

    }

    public void adicionarVeiculo(Veiculo veiculo) {

        veiculos.add(veiculo);
        System.out.println("Foi adicionado um veículo");

    }

    public void listarVeiculos() {

        for( Veiculo i: veiculos) {
            System.out.println(i);

        }
    }

    public Veiculo veiculo_menos_km() {

        Veiculo menosKm = null;
        for (Veiculo v : veiculos) {
            if (menosKm == null || v.distanciaTotal() < menosKm.distanciaTotal()) {
                menosKm = v;
            }
        }
        return menosKm;

    }

    @Override
    public String toString() {

        return nome;
    }
}
