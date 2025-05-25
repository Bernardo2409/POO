package Learning7;

public class ScooterEletrica extends Veiculo implements IEletrico {

    private int bateria;

    public ScooterEletrica() {
        super();
        this.bateria = 100;
    }

    @Override
    public double getNivelBateria() {
        return bateria;
    }

    @Override
    public void mover(double km) {
        if (bateria <= 0) {
            System.out.println("Bateria descarregada!");
            return;
        }
        this.totalKm += km;
        bateria -= km * 2; // Consome 2% por km
        if (bateria < 0) bateria = 0;
    }

    @Override
    public void carregar() {
        bateria = 100;
    }

    @Override
    public void consumirEnergia(double km) {
        double consumo = km * 2; // 2% por km
        bateria -= consumo;
        if (bateria < 0) bateria = 0;
        totalKm += km;
    }
}
