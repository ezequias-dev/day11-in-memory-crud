package exercises;

import java.util.ArrayList;

class CustomerRecord {
    private String fullName;
    private String email;

    public CustomerRecord(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public void showSummary() {
        System.out.println("Name: " + getFullName() + " | Email: " + getEmail());
    }
}

public class Exercise03 {
    public static void main(String[] args) {
        ArrayList<CustomerRecord> customers = new ArrayList<>();

        customers.add(new CustomerRecord("Carlos Almeida", "carlos@email.com"));
        customers.add(new CustomerRecord("Ezequias Souza", "ezequias@email.com"));
        customers.add(new CustomerRecord("Maria Silva", "maria@email.com"));
        customers.add(new CustomerRecord("Marina Gomes", "marina@email.com"));

        String targetEmail = "maria@email.com";
        CustomerRecord found = null;

        for (CustomerRecord customer : customers) {
            if (targetEmail.equals(customer.getEmail())) {
                found = customer;
                break;
            }
        }

        if (found != null) {
            found.showSummary();
        } else {
            System.out.println("Customer not found");
        }
    }
}