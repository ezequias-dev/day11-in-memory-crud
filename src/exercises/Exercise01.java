package exercises;

import java.util.ArrayList;

class ProductRecord {
    private int id;
    private String name;
    private double price;

    public ProductRecord(int id, String name, double price) {
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

    public void showSummary() {
        System.out.print("Id: " + getId() + " | Name: " + getName());
        System.out.printf(" | Price: $%.2f%n", getPrice());
    }
}

public class Exercise01 {
    public static void main(String[] args) {
        ArrayList<ProductRecord> products = new ArrayList<>();

        products.add(new ProductRecord(1, "MacBook Neo", 499.90));
        products.add(new ProductRecord(2, "MacBook Air", 799.90));
        products.add(new ProductRecord(3, "MacBook Pro", 999.90));
        products.add(new ProductRecord(4, "MacBook Max", 1099.90));

        System.out.println("Total products: " + products.size());
        System.out.println();

        for (ProductRecord product : products) {
            product.showSummary();
        }
    }
}