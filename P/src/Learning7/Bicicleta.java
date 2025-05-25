package Learning7;

public class Bicicleta extends Veiculo{

    public Bicicleta() {
        super();
    }


    @Override
    public void mover(double km) {
        this.totalKm += km;
    }


    
}
