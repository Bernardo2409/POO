package Remakeaula9.Ex2;

public class CommercialPlane extends Plane{
    private int nmr_tripulantes;

    public CommercialPlane(String id, String fabricante, String modelo, int ano_producao, int nmr_max_pas, int vel_max,
            int nmr_tripulantes) {
        super(id, fabricante, modelo, ano_producao, nmr_max_pas, vel_max);
        this.nmr_tripulantes = nmr_tripulantes;
    }

    

    @Override
    public String getPlaneType() {

        return "Comercial";
    }

    public int getNmr_tripulantes() {
        return nmr_tripulantes;
    }

    public void setNmr_tripulantes(int nmr_tripulantes) {
        this.nmr_tripulantes = nmr_tripulantes;
    }



    @Override
    public String toString() {
        return "CommercialPlane [nmr_tripulantes=" + nmr_tripulantes + ", getPlaneType()=" + getPlaneType() + "]";
    }
    
}
