package Remakeaula9.Ex2;

public class MilitaryPlane extends Plane{

    private int nmr_municoes;

    public MilitaryPlane(String id, String fabricante, String modelo, int ano_producao, int nmr_max_pas, int vel_max,
            int nmr_municoes) {
        super(id, fabricante, modelo, ano_producao, nmr_max_pas, vel_max);
        this.nmr_municoes = nmr_municoes;
    }

    public int getNmr_municoes() {
        return nmr_municoes;
    }

    public void setNmr_municoes(int nmr_municoes) {
        this.nmr_municoes = nmr_municoes;
    }

    

    @Override
    public String getPlaneType() {
        return "Militar";
    }

    @Override
    public String toString() {
        return "MilitaryPlane [nmr_municoes=" + nmr_municoes + ", getPlaneType()=" + getPlaneType() + "]";
    }
}
