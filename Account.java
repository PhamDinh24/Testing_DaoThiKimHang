package lan2;

public class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters long");
        }
        this.username = username;
        this.password = password;
    }

    public boolean validatePassword(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        return this.password.equals(password);
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (!validatePassword(oldPassword)) {
            throw new IllegalArgumentException("Old password is incorrect");
        }
        if (newPassword == null || newPassword.length() < 6) {
            throw new IllegalArgumentException("New password must be at least 6 characters long");
        }
        this.password = newPassword;
    }

    public String getUsername() {
        return username;
    }
}
