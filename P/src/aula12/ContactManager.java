package aula12;

import java.util.ArrayList;
import java.time.LocalDate;

public class ContactManager implements IContactCostCalculator {

    private StandardCostCalculator calculator = new StandardCostCalculator();
    
    @Override
    public double calculateCost(double value, IContactCostCalculator.ContactType type) {
        return calculator.calculateCost(value, type);
    }
    

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



    public void call(int id, double minutes) {
        Contact c = getContact(id);
        if (c != null) 
        {
            c.addCallMinutes(minutes);
        }
    }

    public void sendEmail(int id) {
        Contact c = getContact(id);
        if (c != null) c.addEmail();
    }

    public double calculateContactCost(int id) {
        Contact c = getContact(id);
        if (c == null) return -1;
        double cost = 0;
        cost += calculator.calculateCost(c.getCallMinutes(), IContactCostCalculator.ContactType.CELLNUMBER);
        cost += calculator.calculateCost(c.getEmailsSent(), IContactCostCalculator.ContactType.EMAIL);
    return cost;
}


    public void printAllContacts() {

        for (Contact contact : contacts) {

            System.out.println(contact);

        }
    }

    public void readFile(String file) {
        //try e catch para se a primeira linha não tiver os elementos certos
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {  //enquanto a linha do ficheiro nao for nula
                //criar um array como em python
                String[] parts = line.split("\t");
                if (parts.length == 4) {
                    String name = parts[0];
                    int phone = Integer.parseInt(parts[1]);
                    String email = parts[2];
                    LocalDate birthDate = LocalDate.parse(parts[3]);
                    Contact c = new Contact(name, phone, email, birthDate);
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
