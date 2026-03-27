package exercises;

import java.util.ArrayList;

class OrderRecord {
    private String code;
    private double totalAmount;

    public OrderRecord(String code, double totalAmount) {
        this.code = code;
        this.totalAmount = totalAmount;
    }

    public String getCode() {
        return code;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void showSummary() {
        System.out.printf("Code: %s | Total amount: $%.2f%n", getCode(), getTotalAmount());
    }
}

public class Exercise05 {
    public static void main(String[] args) {
        ArrayList<OrderRecord> orders = new ArrayList<>();

        orders.add(new OrderRecord("2514", 100.00));
        orders.add(new OrderRecord("3516", 200.00));
        orders.add(new OrderRecord("1219", 350.00));
        orders.add(new OrderRecord("6422", 500.00));

        String targetCode = "1219";
        OrderRecord foundOrder = null;

        for (OrderRecord order : orders) {
            if (targetCode.equals(order.getCode())) {
                foundOrder = order;
                break;
            }
        }

        if (foundOrder != null) {
            orders.remove(foundOrder);
        }

        for (OrderRecord order : orders) {
            order.showSummary();
        }
    }
}