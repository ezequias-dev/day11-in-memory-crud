package challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Day11Challenge {
    public static void main(String[] args) {
        ArrayList<UserRecord> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.print("\n|--------------OPTIONS MENU--------------\n");
            System.out.print("| Option 1 - Register user\n");
            System.out.print("| Option 2 - List users\n");
            System.out.print("| Option 3 - Search user by email\n");
            System.out.print("| Option 4 - Change active status by ID\n");
            System.out.print("| Option 5 - Remove user by ID\n");
            System.out.print("| Option 6 - Log out\n");
            System.out.print("|-----------------------------\n");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                System.out.println("===== REGISTER USER =====");

                System.out.print("Enter an ID: ");
                int id = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter a full name: ");
                String fullName = scanner.nextLine();

                System.out.print("Enter an email: ");
                String email = scanner.nextLine();

                System.out.print("Enter a role: ");
                String role = scanner.nextLine();

                System.out.print("Active user?: ");
                boolean active = scanner.nextBoolean();

                UserRecord user = new UserRecord(id, fullName, email, role, active);
                users.add(user);

                System.out.println();
                System.out.println("User successfully registered!");
                System.out.println("=========================");
            }

            if (option == 2) {
                System.out.println("===== LIST USERS =====");

                for (UserRecord user : users) {
                    user.showUserSummary();
                }

                System.out.println();

                int validUsers = 0;
                int activeUsers = 0;

                for (UserRecord user : users) {
                    if(user.isValidUser()) {
                        validUsers++;
                    }

                    if (user.isActive()) {
                        activeUsers++;
                    }
                }

                System.out.println("Total users: " + users.size());
                System.out.println("Total valid users: " + validUsers);
                System.out.println("Total active users: " + activeUsers);
                System.out.println("======================");
            }

            if (option == 3) {
                scanner.nextLine();

                System.out.print("Enter the email address of the user you wish to search for: ");
                String targetEmail = scanner.nextLine();

                UserRecord foundUser = null;

                for (UserRecord user : users) {
                    if (targetEmail != null && targetEmail.equals(user.getEmail())) {
                        foundUser = user;
                    }
                }

                if (foundUser != null) {
                    System.out.println();
                    foundUser.showUserSummary();
                } else {
                    System.out.println("User not found");
                }
            }

            if (option == 4) {
                System.out.println("===== CHANGE ACTIVE STATUS =====");

                System.out.print("Enter an ID: ");
                int targetId = scanner.nextInt();

                System.out.println();

                for (UserRecord user : users) {
                    if (targetId == user.getId()) {
                        System.out.println("ID found!");

                        System.out.print("Enter the new value for active: ");
                        boolean newValue = scanner.nextBoolean();

                        user.setActive(newValue);

                        System.out.println();
                        System.out.println("Status changed successfully.");
                        System.out.println("================================");
                    } else {
                        System.out.println("ID not found!");
                    }
                }
            }

            if (option == 5) {

            }

        } while (option != 6);

        scanner.close();
    }
}