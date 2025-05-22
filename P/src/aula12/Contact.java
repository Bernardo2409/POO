package aula12;

import java.time.LocalDate;

public class Contact {

    private static int nextId = 1;
    private int id;
    private String name;
    private int phone;
    private String email;
    private LocalDate birthDate;
    
    public Contact(String name, int phone, String email, LocalDate birthDate) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthDate;
        this.id = nextId++;
    }



    @Override
    public String toString() {
        return "Contact " + ", Name = " + name + ", Phone number = " + phone +
            ", email = " + email + ", BirthDate = " + birthDate + "]";
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : birthDate.hashCode());
        result = prime * result + phone;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
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
        Contact other = (Contact) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (phone != other.phone)
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (birthDate == null) {
            if (other.birthDate != null)
                return false;
        } else if (!birthDate.equals(other.birthDate))
            return false;
        return true;
    }

    public int getId() {
        return id;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setData_nascimento(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


}
