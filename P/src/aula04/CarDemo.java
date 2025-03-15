import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms += distance;
    }

    public String toString() {
        return make + " " + model + ", " + year + ", kms: " + kms;
    }
}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        int numCars = 0;
        while (true) {
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] data = input.split(" ");
            if (data.length == 4) {
                String make = data[0];
                String model = data[1];
                int year = Integer.parseInt(data[2]);
                int kms = Integer.parseInt(data[3]);
                cars[numCars] = new Car(make, model, year, kms);
                numCars++;
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }
        return numCars;
    }

    static void registerTrips(Car[] cars, int numCars) {
        while (true) {
            System.out.print("Registe uma viagem no formato(está em index) \"carro:distância\": ");
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] data = input.split(":");
            if (data.length == 2) {
                int carIndex = Integer.parseInt(data[0]);
                int distance = Integer.parseInt(data[1]);
                if (carIndex >= 0 && carIndex < numCars) {
                    cars[carIndex].drive(distance);
                    System.out.println("Carro " + carIndex + " viajou " + distance + " quilómetros.");
                } else {
                    System.out.println("Índice de carro inválido. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }
    }

    static void listCars(Car[] cars, int numCars) {
        System.out.println("\nCarros registados: ");
        for (int i = 0; i < numCars; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars > 0) {
            listCars(cars, numCars);
            registerTrips(cars, numCars);
            listCars(cars, numCars);
        }

        sc.close();
    }
}