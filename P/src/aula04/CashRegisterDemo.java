import java.util.ArrayList;
import java.util.List;


class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
}


class CashRegister {

//TO DO: completar implementação da classe
    public List<Product> products;

    public CashRegister() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalValue() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalValue();
        }
        return total;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s %5s %10s %10s\n", "Product", "Price", "Quantity", "Total"));

        for (Product product : products) {
            sb.append(String.format("%-15s %5.2f %10d %10.2f\n", product.getName(), product.getPrice(), product.getQuantity(), product.getTotalValue()));
        }
        sb.append(String.format("\n"));
        sb.append(String.format("Total value: %9.2f", getTotalValue()));
        
        return sb.toString();
    }

    

}

public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        //TO DO: Listar o conteúdo e valor total
        System.out.println(cr);

    }
}
