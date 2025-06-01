package Remakeaula9.Ex2;

public class Plane {
    
    public Plane(String id, String fabricante, String modelo, int ano_producao, int nmr_max_pas, int vel_max) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano_producao = ano_producao;
        this.nmr_max_pas = nmr_max_pas;
        this.vel_max = vel_max;
    }

    private String id;
    private String fabricante;
    private String modelo;
    private int ano_producao;
    private int nmr_max_pas;
    private int vel_max;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno_producao() {
        return ano_producao;
    }
    public void setAno_producao(int ano_producao) {
        this.ano_producao = ano_producao;
    }
    public int getNmr_max_pas() {
        return nmr_max_pas;
    }
    public void setNmr_max_pas(int nmr_max_pas) {
        this.nmr_max_pas = nmr_max_pas;
    }
    public int getVel_max() {
        return vel_max;
    }
    public void setVel_max(int vel_max) {
        this.vel_max = vel_max;
    }

    public String getPlaneType() {

        return "Genérico";
    }
    @Override
    public String toString() {
        return "Plane [id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", ano_producao="
                + ano_producao + ", nmr_max_pas=" + nmr_max_pas + ", vel_max=" + vel_max + "]";
    }
    
}
