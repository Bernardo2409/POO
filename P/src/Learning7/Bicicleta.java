package Learning7;

public class Bicicleta extends Veiculo implements IManual{

    public Bicicleta(String id) {
        super(id);
    }


    @Override
    public void mover(double km) {
        this.totalKm += km;
    }

    public void pedalar(double km) {
        totalKm += km;
    }

    
}
