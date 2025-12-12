package Oop;

import java.util.Scanner;

public class M3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

        	System.out.print("Default password :");
            String initialPassword = sc.nextLine();
        	System.out.print("New password :");
            String newPassword = sc.nextLine();

            Op3 u = new Op3(initialPassword);
            u.setPassword(newPassword);

            System.out.println(u.getPassword());
        }
    }
}