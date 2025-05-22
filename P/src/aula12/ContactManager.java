package aula12;

import java.util.ArrayList;
import java.time.LocalDate;

public class ContactManager implements IContactCostCalculator {

    ArrayList<Contact> contacts = new ArrayList<>();   

    public void addContact( Contact c) {

        contacts.add(c);

    }

    public void removeContact (int id) {

        contacts.remove(id);

    }

    public Contact getContact(int id) {

        for (Contact contact : contacts)
            {
                if(contact.getId() == id){   
                    
                    return contact;
                }
            }
        return null;
    }

    public double calculateContactCost(int id) {
        
        if (getContact(id) == null) {
            return -1;
        } else {
            return StandardCostCalculator();
        }
    }

    public double StandardCostCalculator() {

        double units = 1; 
        ContactType type = ContactType.CELLNUMBER;

        if (ContactType.CELLNUMBER == type) { //telemovel
            
            return 0.10 * units;

        } else { //email

            return 0.0;
        }

    }

    public void printAllContacts() {

        for (Contact contact : contacts) {

            System.out.println(contact);

        }
    }

    public void readFile(String file) {
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 4) {
                    String name = parts[0];
                    int phone = Integer.parseInt(parts[1]);
                    String email = parts[2];
                    LocalDate birthDate = LocalDate.parse(parts[3]);
                    Contact c = new Contact(name, phone, email, birthDate);
                    addContact(c);
                    addContact(c);
                }
            }
        } catch (java.io.IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void writeFile(String file) {
        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(file))) {
            for (Contact contact : contacts) {
                String line = contact.getName() + ";" +
                              contact.getPhone() + ";" +
                              contact.getEmail() + ";" +
                              contact.getBirthDate();
                bw.write(line);
                bw.newLine();
            }
        } catch (java.io.IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }



}
