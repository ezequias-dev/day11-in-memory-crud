package examples;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SystemUser> users = new ArrayList<>();

        users.add(new SystemUser(1, "Ezequias Souza", "ezequias@email.com", true));
        users.add(new SystemUser(2, "Maria Silva", "maria@email.com", false));
        users.add(new SystemUser(3, "Carlos Lima", "carlos@email.com", true));

        System.out.println("Total users: " + users.size());
        System.out.println("----- USER LIST -----");

        for (int i = 0; i < users.size(); i++) {
            users.get(i).showSummary();
        }

        String targetEmail = "maria@email.com";
        SystemUser foundUser = null;

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(targetEmail)) {
                foundUser = users.get(i);
                break;
            }
        }

        if (foundUser != null) {
            System.out.println();
            System.out.println("User found");
            foundUser.showSummary();
        } else {
            System.out.println("User not found");
        }
    }
}