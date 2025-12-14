package Oop;

import java.util.Scanner;

class User {

    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3;

    public User(String username) {
        this.username = username;
        failedAttempts = 0;
        isLocked = false;
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void login(String password) {

        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        if (password.equals("pass123")) {
            failedAttempts = 0;
            System.out.println("Login successful.");
        } else {
            failedAttempts = failedAttempts + 1;

            if (failedAttempts >= maxAttempts) {
                isLocked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                int left;
                left = maxAttempts - failedAttempts;
                System.out.println(
                    "Login failed. " + left + " attempts left."
                );
            }
        }
    }
}

public class Op15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username;
        username = sc.nextLine();

        User user = new User(username);

        int N;
        N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {

            String command;
            command = sc.nextLine();

            if (command.equals("SET_POLICY")) {

                int max;
                max = sc.nextInt();
                sc.nextLine();
                User.setPolicy(max);

            } else if (command.equals("LOGIN")) {

                String password;
                password = sc.nextLine();
                user.login(password);
            }
        }

        sc.close();
    }
}
