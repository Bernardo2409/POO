package Learning12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contact {

    private int id;
    private static int nextId = 1;
    private String name;
    private int phone;
    private String email;
    private LocalDate birthdata;
    

    public Contact(String name, int phone, String email, String birthdata) {
        this.id = nextId++;
        this.name = name;
        this.phone = phone;
        this.email = email;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
        this.birthdata = LocalDate.parse(birthdata, formatter);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Contact.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdata() {
        return birthdata;
    }

    public void setBirthdata(LocalDate birthdata) {
        this.birthdata = birthdata;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", birthdata="
                + birthdata + "]";
    }

    
    
}
