import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Concert {

    private int Id;
    private static int nextID = 1;
    private double duration;
    private String place;
    private LocalDateTime dateandhora;
    
    public Concert( String place, String dateandhora, double duration) {
        Id = nextID++;
        this.duration = duration;
        this.place = place;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.dateandhora = LocalDateTime.parse(dateandhora, formatter);

    }

    

    public String getMonth() {

        return dateandhora.getMonth().toString();
    }

    public String getCountry() {

        String[] sitios = place.split(", ");
        String city = sitios[0];
        String country = sitios[1];

        return country;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Concert.nextID = nextID;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDateTime getDateandhora() {
        return dateandhora;
    }

    public void setDateandhora(LocalDateTime dateandhora) {
        this.dateandhora = dateandhora;
    }

    @Override
    public String toString() {
        return "Concert: Id=" + Id + " | Duração = " + duration + " | Local do Concerto = " + place + " | Data e hora do Iníci o= " + getDataHoraFormatada();
    }

    public String getDataHoraFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return dateandhora.format(formatter);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Id;
        result = prime * result + ((place == null) ? 0 : place.hashCode());
        result = prime * result + ((dateandhora == null) ? 0 : dateandhora.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Concert other = (Concert) obj;
        if (Id != other.Id)
            return false;
        if (duration != other.duration)
            return false;
        if (place == null) {
            if (other.place != null)
                return false;
        } else if (!place.equals(other.place))
            return false;
        if (dateandhora == null) {
            if (other.dateandhora != null)
                return false;
        } else if (!dateandhora.equals(other.dateandhora))
            return false;
        return true;
    }
    
}
