package Oop;

import java.util.Scanner;

public class M9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int minLength1 = sc.nextInt();
        Op9.setMinLength(minLength1);

        String user1Name = sc.next();
        String user1Pass = sc.next();

        Op9 user1 = new Op9(user1Name, user1Pass);

        String user2Name = sc.next();
        String user2Pass = sc.next();

        Op9 user2 = new Op9(user2Name, user2Pass);

        int minLength2 = sc.nextInt();
        Op9.setMinLength(minLength2);

        String user2NewPass = sc.next();
        user2.setPassword(user2NewPass);

        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());

        sc.close();
    }
}