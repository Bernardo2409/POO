package MiniTeste_2EduardoLaranjeiro126156;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Charge {
    static int id_next;
    int id;
    double energia;
    String local;
    LocalDateTime dataHora;

    public Charge(double energia, String local, String dataHoraStr) {
        this.id = id_next++;
        this.energia = energia;
        this.local = local;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
        this.dataHora = LocalDateTime.parse(dataHoraStr, formatter);
    
        
    }

    public int getId(){return id;}
    public double getEnergia(){return energia;}
    public String getLocal(){return local;}
    public LocalDateTime getDataHora(){return dataHora;}

    public int getHora() {
        return dataHora.getHour();
    }

    
   
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");



    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataHoraStr = dataHora.format(formatter);
        return String.format(
            "ID: %d | Energia Consumida: %.2f Kw/h | Local de Carga: %s | Data e Hora de Carga: %s",
            id, energia, local, dataHoraStr
        );
}
}
