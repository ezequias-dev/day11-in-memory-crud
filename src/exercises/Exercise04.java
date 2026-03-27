package exercises;

import java.util.ArrayList;

class CatalogItem {
    private int id;
    private String name;
    private double price;

    public CatalogItem(int id, String name, double price) {
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

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void showSummary() {
        System.out.print("Id: " + getId() + " | Name: " + getName());
        System.out.printf(" | Price: $%.2f%n", getPrice());
    }
}

public class Exercise04 {
    public static void main(String[] args) {
        ArrayList<CatalogItem> items = new ArrayList<>();

        items.add(new CatalogItem(1, "MacBook Neo", 499.90));
        items.add(new CatalogItem(2, "MacBook Air", 699.90));
        items.add(new CatalogItem(3, "MacBook Pro", 899.90));
        items.add(new CatalogItem(4, "MacBook Pro M5", 999.90));

        int targetId = 3;

        for (CatalogItem item : items) {
            if (targetId == item.getId()) {
                item.setPrice(700.00);
                break;
            }
        }

        System.out.println("---- UPDATED LIST ----");
        for (CatalogItem item : items) {
            item.showSummary();
        }
    }
}