package Remakeaula9.Ex2;
import java.util.*;

public class PlaneTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlaneManager manager = new PlaneManager();
        int choice;

        do {
            System.out.println("\n--- Menu Frota de Aviões ---");
            System.out.println("1. Adicionar avião comercial");
            System.out.println("2. Adicionar avião militar");
            System.out.println("3. Remover avião");
            System.out.println("4. Procurar avião");
            System.out.println("5. Imprimir todos os aviões");
            System.out.println("6. Listar aviões comerciais");
            System.out.println("7. Listar aviões militares");
            System.out.println("8. Mostrar avião mais rápido");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("ID: "); String id = sc.nextLine();
                    System.out.print("Fabricante: "); String fab = sc.nextLine();
                    System.out.print("Modelo: "); String mod = sc.nextLine();
                    System.out.print("Ano: "); int ano = sc.nextInt();
                    System.out.print("Passageiros: "); int pass = sc.nextInt();
                    System.out.print("Velocidade: "); int vel = sc.nextInt();
                    System.out.print("Tripulantes: "); int crew = sc.nextInt();
                    sc.nextLine();
                    manager.addPlane(new CommercialPlane(id, fab, mod, ano, pass, vel, crew));
                    break;
                }
                case 2: {
                    System.out.print("ID: "); String id = sc.nextLine();
                    System.out.print("Fabricante: "); String fab = sc.nextLine();
                    System.out.print("Modelo: "); String mod = sc.nextLine();
                    System.out.print("Ano: "); int ano = sc.nextInt();
                    System.out.print("Passageiros: "); int pass = sc.nextInt();
                    System.out.print("Velocidade: "); int vel = sc.nextInt();
                    System.out.print("Munições: "); int ammo = sc.nextInt();
                    sc.nextLine();
                    manager.addPlane(new MilitaryPlane(id, fab, mod, ano, pass, vel, ammo));
                    break;
                }
                case 3: {
                    System.out.print("ID do avião a remover: ");
                    String id = sc.nextLine();
                    manager.removePlane(id);
                    break;
                }
                case 4 : {
                    System.out.print("ID do avião a procurar: ");
                    String id = sc.nextLine();
                    Plane p = manager.searchPlane(id);
                    System.out.println((p != null) ? p : "Avião não encontrado.");
                    break;
                }
                case 5 : 
                    manager.printAllPlanes();
                    break;
                case 6 : 
                    if (manager.getCommercialPlanes().isEmpty()) {
                        System.out.println("nao existem");
                    } else {
                        manager.getCommercialPlanes().forEach(System.out::println);
                    }
                    break;
                case 7 : 
                    if (manager.getMilitaryPlanes().isEmpty()) {
                        System.out.println("nao existem");
                    } else {
                        manager.getMilitaryPlanes().forEach(System.out::println);
                    }
                    break;
                case 8 : {
                    Plane fastest = manager.getFastestPlane();
                    System.out.println((fastest != null) ? fastest : "Nenhum avião na frota.");
                    break;
                }
                case 0 : 
                    System.out.println("A sair...");
                    break;
                default : 
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}