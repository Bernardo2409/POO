package Learning9.Ex2;

public class PratoDieta extends Prato {

    private double maxcal;

    public PratoDieta(String nome, double maxcal) {
        super(nome);
        this.maxcal = maxcal;
    }

    public boolean calorias_no_max() {

        if (caloriasTotais() > maxcal) {

            return true;
        } else {

            return false;
        }

    }

    /* 
    @Override
    public boolean addIngrediente(Alimento aux) {

        if (calorias_no_max() == true)  {

            return false;
        }   else {

            return true;
        }
    }

    */

}
