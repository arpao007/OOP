package Oop;

public class Op3 {
    private String password;

    public Op3(String initialPassword) {
        password = initialPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}