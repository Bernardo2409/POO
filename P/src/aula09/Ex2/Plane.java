package aula09.Ex2;

public class Plane {

    String id ;
    String fabricante;
    String modelo;
    int anoprod;
    int nrmaxpassageiros;
    int vmax;

    public Plane(String id, String fabricante, String modelo, int anoprod, int nrmaxpassageiros, int vmax) {

        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoprod = anoprod;
        this.nrmaxpassageiros = nrmaxpassageiros;
        this.vmax = vmax;

    }

    @Override
    public String toString() {
        return "Plane [id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", anoprod=" + anoprod
                + ", nrmaxpassageiros=" + nrmaxpassageiros + ", vmax=" + vmax + "]";
    }

    public boolean hasId(String id) {
        return this.id.equals(id);
    }








}
