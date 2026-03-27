package exercises;

import java.util.ArrayList;

class UserRecord {
    private int id;
    private String fullName;
    private boolean active;

    public UserRecord(int id, String fullName, boolean active) {
        this.id = id;
        this.fullName = fullName;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isActive() {
        return active;
    }

    public void showUserSummary() {
        System.out.println(
            "Id: " + getId() +
            " | Name: " + getFullName() +
            " | Active: " + isActive()
        );
    }
}

public class Exercise02 {
    public static void main(String[] args) {
        ArrayList<UserRecord> users = new ArrayList<>();

        users.add(new UserRecord(1, "Ezequias Souza", true));
        users.add(new UserRecord(2, "Maria Silva", false));
        users.add(new UserRecord(3, "Carlos Lima", true));
        users.add(new UserRecord(4, "Pedro Andrade", true));
        users.add(new UserRecord(5, "Mike Gomes", true));

        int activeUsers = 0;

        for (UserRecord user : users) {
            user.showUserSummary();

            if (user.isActive()) {
                activeUsers++;
            }
        }

        System.out.println();
        System.out.println("Active users: " + activeUsers);
    }
}