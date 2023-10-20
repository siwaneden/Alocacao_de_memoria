import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        int productId = 1;
        boolean continueAdding = true;

        while (continueAdding) {
            System.out.print("Digite o nome do produto: ");
            String productName = scanner.nextLine();

            System.out.print("Digite o preço: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer

            Product product = new Product(productId, productName, productPrice);
            products.add(product); // adicionar à lista dinamicamente

            System.out.print("mais produtos? (s/n): ");
            String escolha = scanner.nextLine();
            if (escolha.equalsIgnoreCase("n")) {
                continueAdding = false;
            }

            productId++;
        }

        System.out.println("Produtos cadastrados:");
        for (Product product : products) {
            System.out.println("ID: " + product.getId());
            System.out.println("Nome: " + product.getName());
            System.out.println("Preço: " + product.getPrice());
            System.out.println();
        }
    }
}
