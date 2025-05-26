package Learning9.Ex1;

import java.util.ArrayList;

public class Veiculo implements IKmPercorridos{

    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int trajeto = 0;


    
    public Veiculo(String matricula, String marca, String modelo, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        
    }


    public String getMatricula() {
        return matricula;
    }


    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public int getPotencia() {
        return potencia;
    }

    private ArrayList<Integer> quilometro = new ArrayList<>();

    @Override 
    public void trajeto(int quilometros){

        trajeto += quilometros;

        quilometro.add(quilometros);

        
    }

    @Override
    public int ultimoTrajeto() {
        if (quilometro.isEmpty()) {
        return 0; // ou outro valor que faça sentido
        }
        return quilometro.get(quilometro.size() - 1);

    }

    @Override
    public int distanciaTotal() {


        return trajeto;
    }

}

