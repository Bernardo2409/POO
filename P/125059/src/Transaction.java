import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private int id;
    private static int nextId = 1;
    private double horas_de_trabalho;
    private String desc_serv;
    private LocalDateTime data_hora_serv;

    
    public Transaction(String desc_serv, String data_hora_serv, double horas_de_trabalho) {
        this.id = nextId++;
        this.horas_de_trabalho = horas_de_trabalho;
        this.desc_serv = desc_serv;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.data_hora_serv = LocalDateTime.parse(data_hora_serv, formatter);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
    this.id = id;
    }

    public double getHoras() {

        return horas_de_trabalho;
    }

    public String getDescricao() {

        return desc_serv;
    }

    public LocalDateTime getDataHora() {
        return data_hora_serv;
    }

    public String getDiaDaSemana() {

        return data_hora_serv.getDayOfWeek().toString();
    }

    public String getDataHoraFormatada() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    return data_hora_serv.format(formatter);
    }


    @Override
public String toString() {
    return "Transaction [id=" + id + ", horas_de_trabalho=" + horas_de_trabalho + ", desc_serv=" + desc_serv
            + ", data_hora_serv=" + getDataHoraFormatada() + "]";
}




   

    

    
}
