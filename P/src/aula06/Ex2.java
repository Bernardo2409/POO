package aula06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import aula05.DateYMD;
import aula06.Ex1.Pessoa;

public class Ex2 {
    


    static class Contacto {
        private static int nextid = 1;
        private int id;
        private Pessoa nome;
        private String telemovel;
        private String email;

                
        public Contacto(Pessoa nome, String telemovel, String email) {
            if (!validTelemovel(telemovel) && !validEmail(email)) {
                throw new IllegalArgumentException("Tem de ter e-mail e nº de telemóvel válido");
            }
            this.id = nextid++;
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

        public Pessoa getNome() {
            return nome;
        }
        public void setTelemovel(String telemovel) {
            if (validTelemovel(telemovel)) {
            this.telemovel = telemovel;
            } else {
                throw new IllegalArgumentException("Telemóvel inválido");
            }
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            if (validEmail(email)) {
                this.email = email;
            } else {
                throw new IllegalArgumentException("Email inválido.");
            }
        }
        

        public boolean validTelemovel(String telemovel) {


            return telemovel != null && telemovel.matches("9\\d{8}");

        }


        public boolean validEmail(String email) {

            return email != null && email.matches(".+@.+\\..+");
            
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Nome: " + nome + ", Telemóvel: " + telemovel + ", Email: " + email;
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
            sc.nextLine();

            switch (opcao) {
                case 1:
                   System.out.println("Nome da Pessoa: ");
                    String nomePessoa = sc.nextLine();
                    System.out.println("Número de CC: ");
                    int cc = sc.nextInt();
                    sc.nextLine(); 
                    System.out.println("Data de Nascimento (dd/mm/aaaa): ");
                    String dataNascStr = sc.nextLine();
                    String[] dataNascParts = dataNascStr.split("/");
                    DateYMD dataNasc = new DateYMD(Integer.parseInt(dataNascParts[0]),
                                                    Integer.parseInt(dataNascParts[1]),
                                                    Integer.parseInt(dataNascParts[2]));
                    Pessoa pessoa = new Pessoa(nomePessoa, cc, dataNasc);
                    boolean pessoaExiste = contactos.stream()
                            .anyMatch(c -> c.getNome().equals(pessoa));
                    if (pessoaExiste) {
                        System.out.println("A pessoa já existe. Deseja continuar a inserir como novo contacto? (s/n)");
                        String resposta = sc.nextLine();
                        if (!resposta.equalsIgnoreCase("s")) {
                            break;
                        }
                    }
                    System.out.println("Número de telemóvel: ");
                    String telemovel = sc.nextLine();
                    System.out.println("Endereço de email: ");
                    String email = sc.nextLine();
                    
                    try {
                        Contacto novoContacto = new Contacto(pessoa, telemovel, email);
                        contactos.add(novoContacto);
                        System.out.println("Contacto inserido com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("ID do contacto a alterar: ");
                    int idAlterar = sc.nextInt();
                    sc.nextLine(); 
                    Contacto contactoAlterar = contactos.stream()
                            .filter(c -> c.getId() == idAlterar)
                            .findFirst()
                            .orElse(null);

                    if (contactoAlterar != null) {
                        System.out.println("Novo número de telemóvel (deixe vazio para não alterar): ");
                        String novoTelemovel = sc.nextLine();
                        System.out.println("Novo email (deixe vazio para não alterar): ");
                        String novoEmail = sc.nextLine();

                        try {
                            if (!novoTelemovel.isEmpty()) {
                                contactoAlterar.setTelemovel(novoTelemovel);
                            }
                            if (!novoEmail.isEmpty()) {
                                contactoAlterar.setEmail(novoEmail);
                            }
                            System.out.println("Contacto alterado com sucesso!");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Contacto não encontrado.");
                    }
                    break;

            case 3:
                System.out.println("ID do contacto a apagar: ");
                int idApagar = sc.nextInt();
                sc.nextLine(); 
                contactos.removeIf(c -> c.getId() == idApagar);
                System.out.println("Contacto apagado com sucesso!");
                break;

            case 4:
            System.out.println("Pesquisar por (1) Nome ou (2) Número de telemóvel?");
            int criterio = sc.nextInt();
            sc.nextLine(); 
            List<Contacto> resultados = new ArrayList<>();

            if (criterio == 1) {
                System.out.println("Digite o nome: ");
                String nomePesquisa = sc.nextLine();
                resultados = contactos.stream()
                        .filter(c -> c.getNome().toString().equalsIgnoreCase(nomePesquisa))
                        .collect(Collectors.toList());
            } else if (criterio == 2) {
                System.out.println("Digite o número de telemóvel: ");
                String telemovelPesquisa = sc.nextLine();
                resultados = contactos.stream()
                        .filter(c -> c.getTelemovel().equals(telemovelPesquisa))
                        .collect(Collectors.toList());
            }

            if (resultados.isEmpty()) {
                System.out.println("Nenhum contacto encontrado.");
                break;
            }

            System.out.println("Contactos encontrados:");
            resultados.forEach(System.out::println);

            System.out.println("Digite o ID do contacto que deseja alterar/apagar/procurar:");
            int idEscolhido = sc.nextInt();
            sc.nextLine(); 
            Contacto contactoEscolhido = contactos.stream()
                    .filter(c -> c.getId() == idEscolhido)
                    .findFirst()
                    .orElse(null);

            if (contactoEscolhido == null) {
                System.out.println("ID inválido.");
                break;
            }

            if (opcao == 2) {
                System.out.println("Novo número de telemóvel (deixe vazio para não alterar): ");
                String novoTelemovel = sc.nextLine();
                System.out.println("Novo email (deixe vazio para não alterar): ");
                String novoEmail = sc.nextLine();

                try {
                    if (!novoTelemovel.isEmpty()) {
                        contactoEscolhido.setTelemovel(novoTelemovel);
                    }
                    if (!novoEmail.isEmpty()) {
                        contactoEscolhido.setEmail(novoEmail);
                    }
                    System.out.println("Contacto alterado com sucesso!");
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            } else if (opcao == 3) { 
                contactos.remove(contactoEscolhido);
                System.out.println("Contacto apagado com sucesso!");
            } else if (opcao == 4) { 
                System.out.println(contactoEscolhido);
            }
            break;

            case 5:
                System.out.println("Lista de contactos:");
                contactos.forEach(System.out::println);
                break;

            case 0:
                System.out.println("A sair...");
                break;

            default:
                System.out.println("Opção inválida.");

            } 
        } while (opcao != 0);
        sc.close();
    }
}



