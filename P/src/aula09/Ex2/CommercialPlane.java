package aula09.Ex2;

public class CommercialPlane extends Plane {

    int nrpassageiros;

    public CommercialPlane(String id, String fabricante, String modelo, int anoprod, int nrmaxpassageiros, int vmax, int nrpassageiros) {

        super(id, fabricante, modelo, anoprod, nrmaxpassageiros, vmax);
        this.nrpassageiros = nrpassageiros;
    }

   public String getPlaneType() {

        return "Comercial";
    }

    
    @Override
    public String toString() {
        return "CommercialPlane [id=" + id + ", fabricante=" + fabricante + ", nrpassageiros=" + nrpassageiros
                + ", modelo=" + modelo + ", anoprod=" + anoprod + ", nrmaxpassageiros=" + nrmaxpassageiros + ", vmax="
                + vmax + "]";
    }

    

}
