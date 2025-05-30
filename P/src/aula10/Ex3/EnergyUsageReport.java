package aula10.Ex3;

import java.io.*;
import java.util.*;

public class EnergyUsageReport {
    private Map<Integer, Customer> customers = new HashMap<>();

    // Carrega os dados do ficheiro
    public void load(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.trim().split("\\|");
                int id = Integer.parseInt(partes[0].trim());

                List<Double> leituras = new ArrayList<>();
                for (int i = 1; i < partes.length; i++) {
                    leituras.add(Double.parseDouble(partes[i].trim()));
                }

                customers.put(id, new Customer(id, leituras));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Erro: O ficheiro '" + filename + "' não foi encontrado.");
        } catch (IOException e) {
            System.err.println("Erro ao ler o ficheiro: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro de formatação nos dados: " + e.getMessage());
        }
    }

    // Adiciona cliente
    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    // Remove cliente pelo ID
    public void removeCustomer(int customerId) {
        customers.remove(customerId);
    }

    // Retorna o cliente
    public Customer getCustomer(int customerId) {
        return customers.get(customerId);
    }

    // Calcula uso total de energia
    public double calculateTotalUsage(int customerId) {
        Customer c = customers.get(customerId);
        if (c == null) return 0.0;
        return c.getMeterReadings().stream().mapToDouble(Double::doubleValue).sum();
    }

    // Gera o relatório
    public void generateReport(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Customer c : customers.values()) {
                double total = calculateTotalUsage(c.getCustomerId());
                writer.write(c.getCustomerId() + " | " + total);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao escrever o relatório: " + e.getMessage());
        }
    }
}
