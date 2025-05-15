package aula09.Ex2;

public class MilitaryPlane extends Plane{

    int nrmunicoes;

    public MilitaryPlane(String id, String fabricante, String modelo, int anoprod, int nrmaxpassageiros, int vmax, int nrmunicoes) {

        super(id, fabricante, modelo, anoprod, nrmaxpassageiros, vmax);
        this.nrmunicoes = nrmunicoes;

    }

    public String getPlaneType() {

        return "Militar";
    }

    @Override
    public String toString() {
        return "MilitaryPlane [id=" + id + ", fabricante=" + fabricante + ", nrmunicoes=" + nrmunicoes + ", modelo="
                + modelo + ", anoprod=" + anoprod + ", nrmaxpassageiros=" + nrmaxpassageiros + ", vmax=" + vmax + "]";
    }
    

    

}
