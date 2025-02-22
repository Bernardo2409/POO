package Learning1;

public class Endereco {
    private String cidade;
    private String rua;
    private int porta;
    private String codigopostal;

    //métodos de acesso
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getPorta() {
        return porta;
    }
    public void setPorta(int porta) {
        this.porta = porta;
    }
    public String getCodigopostal() {
        return codigopostal;
    }
    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String imprimir() {

        return cidade + ", " + rua + ", " + porta + ", " + codigopostal;
    }


}
