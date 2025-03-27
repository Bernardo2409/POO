package aula07.Ex3;
import java.util.Scanner;


public class MainGaleria {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner stringc = new Scanner(System.in);
        Galeria galeria = new Galeria(100);
        int opcao = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar uma obra");
            System.out.println("2. Listar obras");
            System.out.println("3. Vender uma obra");
            System.out.println("4. Calcular o lucro total");
            System.out.println("5. Sair");
            System.out.print("Opçao: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\n1. Adicionar uma obra do tipo");
                    System.out.println("1. Quadro");
                    System.out.println("2. Escultura");
                    System.out.println("3. Obra Digital (NFT)");
                    System.out.print("Tipo de produto: ");
                    int opcaoProduto = sc.nextInt();
                    sc.nextLine();
                    switch (opcaoProduto) {
                        case 1:
                        // titulo, autor, preco, do super
                            System.out.println("Título do Quadro?");
                            String tituloq = sc.nextLine();
                            System.out.println("Autor do Quadro?");
                            String autorq = sc.nextLine();
                            System.out.println("Preço do Quadro?");
                            int precoq = sc.nextInt();
                            System.out.println("Tinta do Quadro?");
                            String tintaq = sc.nextLine();
                            System.out.println("O Quadro está emoldurado?");
                            char emolduradoq = sc.next().charAt(0);
                            System.out.println("Tamanho do Quadro?");
                            String tamanhoq = stringc.nextLine();
                            
                            Quadro novo_quadro = new Quadro(tituloq, autorq, precoq,  tintaq, emolduradoq, tamanhoq);
                            galeria.adicionarobras(novo_quadro);
                            break;
                        case 2:
                            // Adicionar uma Escultura
                            System.out.println("Título da Escultura?");
                            String tituloe = sc.nextLine();
                            System.out.println("Autor da Escultura?");
                            String autore = sc.nextLine();
                            System.out.println("Preço da Escultura?");
                            int precoe = sc.nextInt();
                            System.out.println("Material da Escultura?");   
                            String materiae = sc.nextLine();
                            System.out.println("Quantos exemplares existem da Escultura?");
                            int exemplarese = sc.nextInt();
                            Escultura nova_Escultura = new Escultura(tituloe, autore, precoe, precoe, materiae, exemplarese);
                            galeria.adicionarobras(nova_Escultura);
                            break;
                        case 3:
                            // Adicionar uma ObraDigital (i.e., NFT)
                            System.out.println("Título da ObraDigital");
                            String titulod = sc.nextLine();
                            System.out.println("Autor da ObraDigital");
                            String autord = sc.nextLine();
                            System.out.println("Preço da ObraDigital");
                            int precod = sc.nextInt();
                            break;
                    }
                    break;
                case 2:
                    // Listar as obras
                    break;
                case 3:
                    // Vender uma obra
                    break;
                case 4:
                    // Apresentar o lucro total
                    break;
                case 5:
                    System.out.println("5. Sair");
                    sc.close();
                    stringc.close();
                    break;
            }
        } while (opcao != 5);
    }
}




