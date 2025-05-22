package aula12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContactsTester {
    public static void main(String[] args) {
        ContactManager cm = new ContactManager();

        // --------------------------
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Contact c1 = new Contact("Maria Joaquina", 911234567, "joaquina@ua.pt", LocalDate.parse("1985-01-01", formatter));      
        Contact c2 = new Contact("João Miguel", 911234568, "joao@ua.pt",LocalDate.parse("1988-01-01", formatter));
        cm.addContact(c1);
        cm.addContact(c2);
        cm.printAllContacts();
        // --------------------------

        c1 = cm.getContact(1);
        System.out.println(c1);
        c2 = cm.getContact(2);
        System.out.println(c2);
        System.out.println(cm.getContact(5));           // -- não existe!
        System.out.println(cm.calculateContactCost(5)); // -- não existe!
        // --------------------------

        c1.call(3.5);
        c2.email();
        cm.printAllContacts();
        // --------------------------

        cm.readFile("D:\\UA\\1ano\\2 semestre\\POO\\P\\src\\aula12\\contatos.txt");
        cm.printAllContacts();
        // --------------------------

        c1 = cm.getContact(1);
        System.out.println(c1);
        c2 = cm.getContact(2);
        System.out.println(c2);
        System.out.println(cm.getContact(5));
        System.out.println(cm.calculateContactCost(5));
        // --------------------------

        cm.writeFile("out.txt");
    }
}
