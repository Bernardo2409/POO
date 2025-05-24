package Learning7;

public abstract class Veiculo implements IStats{

    private static int contador = 0;
    protected String id;
    protected double totalKm;

    public Veiculo(String id) {
        this.id = "V" + ++contador;
        this.totalKm = 0;
    }

    public String getId() {
        return id;
    }

    public double getTotalKm() {
        return totalKm;
    }

    public abstract void mover(double km);
}
