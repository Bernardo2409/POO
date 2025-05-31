package Learning12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class ContactManager implements IContactCostCalculator {

    private int conections;
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact c) {

        contacts.add(c);

    }

    public void removeContact(int id) {

        contacts.remove(id);
    }

    public Contact getContact(int id) {

        for( Contact c : contacts) {

            if(c.getId() == id) {

                return c;
            }
        } 

        return null;
    }


    public void sendEmail(int id) {
        boolean found = false;
        for (Contact c : contacts) {
            if (id == c.getId()) {
                calculateCost(1, IContactCostCalculator.ContactType.EMAIL);
                System.out.println("Sending email to " + getContact(id) + " ...");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid ID");
        }
    }

    public void call(int id, double minutes) {
        boolean found = false;
        for (Contact c : contacts) {
            if (id == c.getId()) {
                calculateCost(minutes, IContactCostCalculator.ContactType.CELLNUMBER);
                System.out.println("Calling " + getContact(id) + "...");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid ID");
        }
    }


    public void printAllContacts() {

        for(Contact c :contacts) {

            System.out.println(c);
        }

    }

    public void readFile(String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                String name = parts[0];
                int phone = Integer.parseInt(parts[1]);
                String email = parts[2];
                String birthdate = parts[3];

                Contact c = new Contact(name, phone, email, birthdate);
                contacts.add(c);
           
            } 
        }
        catch (Exception e) {
            System.out.println("erro");
        }
    

    }

    public void writeFile(String file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Contact c : contacts) {
                String line = c.getName() + " ; " + c.getPhone() + " ; "+ c.getEmail() + ";" + c.getBirthdata();
                writer.write(line);
                writer.newLine();
            }


        } catch(Exception e) {

            System.out.println("Erro");


        }

    }

    private double totalCost = 0;
    @Override
    public double calculateCost(double units, ContactType type){

        double custo = 0;

        if(type == IContactCostCalculator.ContactType.CELLNUMBER) {

            custo = units * 0.10;

        } else {

            custo = 0;
            
        }

        totalCost += custo;

        return custo;

    }

    public double calculateContactCost() {



        return totalCost;

    }
}
