package Learning1;

import java.util.Scanner;

public class AppPessoaEndereco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);


        //Objeto Pessoa e Endereco
        Pessoa p = new Pessoa();
        Endereco end = new Endereco();


        System.out.println("Digite o nome:");
        p.setNome(scString.nextLine());
        System.out.println("Digite a idade:");
        p.setIdade(sc.nextInt());
        System.out.println("Digite o sexo(F/M)");
        p.setSexo(sc.next().charAt(0));


        System.out.println("Digite a tua cidade: ");
        end.setCidade(scString.nextLine());
        System.out.println("Digite a rua: ");
        end.setRua(scString.nextLine());
        System.out.println("Digite o nº da porta: ");
        end.setPorta(sc.nextInt());
        System.out.println("Digite o código postal");
        end.setCodigopostal(scString.nextLine());


        p.setEnd(end);

        
        System.out.println("Dados da Pessoa: \n" + p.imprimir());
        sc.close();
        scString.close();
    }
}
