package challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Day11Challenge {
    public static void main(String[] args) {
        ArrayList<UserRecord> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println();
            System.out.println("|-------------- OPTIONS MENU --------------|");
            System.out.println("| Option 1 - Register user                 |");
            System.out.println("| Option 2 - List users                    |");
            System.out.println("| Option 3 - Search user by email          |");
            System.out.println("| Option 4 - Update active status by id    |");
            System.out.println("| Option 5 - Remove user by id             |");
            System.out.println("| Option 6 - Exit                          |");
            System.out.println("|------------------------------------------|");
            System.out.print("Chose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println();
                System.out.println("---- REGISTER USER ----");

                System.out.print("Enter user id: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                boolean idAlreadyExists = false;

                for (UserRecord user : users) {
                    if (user.getId() == id) {
                        idAlreadyExists = true;
                        break;
                    }
                }

                if (idAlreadyExists) {
                    System.out.println("A user with this id already exists.");
                } else {
                    System.out.print("Enter full name: ");
                    String fullName = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter role: ");
                    String role = scanner.nextLine();

                    System.out.print("Active user? (true/false): ");
                    boolean active = scanner.nextBoolean();

                    UserRecord user = new UserRecord(id, fullName, email, role, active);
                    users.add(user);

                    System.out.println("User registered successfully.");
                }
            } else if (option == 2) {
                System.out.println();
                System.out.println("---- USER LIST ----");

                if (users.isEmpty()) {
                    System.out.println("No users registered.");
                } else {
                    int validUsers = 0;
                    int activeUsers = 0;

                    for (UserRecord user : users) {
                        user.showUserSummary();

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
                }
            } else if (option == 3) {
                System.out.println();
                System.out.println("---- SEARCH USER BY EMAIL ----");

                System.out.print("Enter email: ");
                String targetEmail = scanner.nextLine();

                UserRecord foundUser = null;

                for (UserRecord user : users) {
                    if (targetEmail != null && targetEmail.equals(user.getEmail())) {
                        foundUser = user;
                        break;
                    }
                }

                if (foundUser != null) {
                    foundUser.showUserSummary();
                } else {
                    System.out.println("User not found");
                }
            } else if (option == 4) {
                System.out.println();
                System.out.println("---- UPDATE ACTIVE STATUS ----");

                System.out.print("Enter user id: ");
                int targetId = scanner.nextInt();
                scanner.nextLine();

                UserRecord foundUser = null;

                for (UserRecord user : users) {
                    if (targetId == user.getId()) {
                        foundUser = user;
                        break;
                    }
                }

                if (foundUser != null) {
                    System.out.print("Enter new active status (true/false): ");
                    boolean newActiveStatus = scanner.nextBoolean();
                    scanner.nextLine();

                    foundUser.setActive(newActiveStatus);
                    System.out.println("User status updated successfully.");
                } else {
                    System.out.println("User id not found.");
                }
            } else if (option == 5) {
                System.out.println();
                System.out.println("---- REMOVE USER BY ID ----");

                System.out.print("Enter an ID: ");
                int targetId = scanner.nextInt();

                System.out.println();

                UserRecord userToRemove = null;

                for (int i = 0; i < users.size(); i++) {
                    if (targetId == users.get(i).getId()) {
                        userToRemove = users.get(i);
                        break;
                    }
                }

                if (userToRemove != null) {
                    users.remove(userToRemove);
                    System.out.println("User removed successfully.");
                } else {
                    System.out.println("ID not found!");
                }

            } else if (option == 6) {
                System.out.println("System closed.");
                scanner.close();
                return;
            } else {
                System.out.println("Invalid option!");
            }
        } while (true);
    }
}