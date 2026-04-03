package challenge;

public class UserRecord {
    private int id;
    private String fullName;
    private String email;
    private String role;
    private boolean active;

    public UserRecord(int id, String fullName, String email, String role, boolean active) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isValidUser() {
        boolean isValidName = fullName != null && fullName.trim().length() >= 3;
        boolean isValidEmail = email != null && email.contains("@");
        boolean isValidRole = role != null && role.trim().length() >= 4;

        return isValidName && isValidEmail && isValidRole;
    }

    public void showUserSummary() {
        System.out.println(
            "Id: " + getId() +
                " | Name: " + getFullName() +
                " | Email: " + getEmail() +
                " | Role: " + getRole() +
                " | Active: " + isActive()
        );
    }
}