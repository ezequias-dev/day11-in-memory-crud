package review;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Day10QuickReview {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("iPhone 13", 299.90));
        products.add(new Product("iPhone 14", 399.90));
        products.add(new Product("iPhone 15", 499.90));

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println("==== PRODUCT " + (i + 1) + " ====");
            System.out.println("Name: " + product.getName());
            System.out.printf("Price: $%.2f%n", product.getPrice());
            System.out.println();
        }

        String targetName = "iPhone 14";
        boolean found = false;

        for (Product product : products) {
            if (product.getName().trim().equals(targetName.trim())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Product found");
        } else {
            System.out.println("Product not found");
        }
    }
}