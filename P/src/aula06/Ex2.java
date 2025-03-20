package aula06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aula06.Ex1.Pessoa;

public class Ex2 {
    


    class Contacto {
        public int nextid = 1;
        private int id;
        private Pessoa nome;
        private String telemovel;
        private String email;

                
        public Contacto(Pessoa nome, String telemovel, String email) {

            this.nome = nome;
            this.telemovel = telemovel;
            this.email = email;

            
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        
        public String getTelemovel() {
            return telemovel;
        }
        public void setTelemovel(String telemovel) {
            this.telemovel = telemovel;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        

        public boolean validTelemovel(String telemovel) {


            if (telemovel.charAt(0) == '9' && telemovel.length() == 9 && telemovel.matches("\\d{9}")) {
                return true;
            } else {
                return false;
            }

        }


        public boolean validEmail(String email) {
            if (email != null && email.matches(".+@.+\\.(pt | com)")) {
                return true;
            } else {
                return false;
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array list de contactos
        List<Contacto> contactos = new ArrayList<>();
        int opcao;
        do {
            System.out.println("1. Inserir contacto");
            System.out.println("2. Alterar contacto");
            System.out.println("3. Apagar contacto");
            System.out.println("4. Procurar contacto");
            System.out.println("5. Listar contactos");
            System.out.println("0. sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    boolean validTelemovel = false;
                    while(!validTelemovel) {
                        System.out.println("Insere um contacto");
                        String telemovel = sc.nextLine();
                        if(Contacto.validTelemovel(telemovel)) {
                            System.out.println("Telemóvel válido.");
                            System.out.println("Nome da Pessoa: ");
                            String nome = sc.nextLine();
                            System.out.println("Endereço de e-mail: ");
                            String email = sc.nextLine();
                            if (Contacto.validEmail(email)){
                                System.out.println("E-mail válido");
                                contactos.add();

                            }

                            //id, nome, numero, email

                        } else {
                            System.out.println("Telemóvel inválido.");
                        }
                        break;
                    }
                case 2:
                    System.out.println("Qual é o contacto que quer alterar?");
                    String telemovelant = sc.nextLine();
                    if(contactos.contains(telemovelant)) {

                        

                    }
                case 3:

                case 4:

                case 5:




            } 
        } while (opcao != 0);
        sc.close();
    }
}



//meter a cena de valido no construtor