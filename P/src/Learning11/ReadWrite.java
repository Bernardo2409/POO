package Learning11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

import aula12.Contact;

public class ReadWrite {


    //Usei o exemplo da Aula12    

    public void readFile(String file) {

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {  // usar o BufferedReader para ler ficheiro

            String line; //definir a linha como string
            while((line = br.readLine()) != null) { //enquanto
                
                String[] parts = line.split("\t"); //dividir numa lista
                String name = parts[0]; // colocar nome de variaveis em cada elemento da lista
                // (...)
                Contact c = new Contact(name, 0, name, null);   // criar o objeto
            }
        } catch (java.io.IOException e) {

            System.out.println(e.getMessage()); // se der erro dá print à mensagem de erro
        }


    }

    ArrayList<Contact> contacts = new ArrayList<>();   


    public void writeFile(String file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) { //usar o BufferedWriter
            for (Contact contact : contacts) {  //iterar pelos contactos
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
