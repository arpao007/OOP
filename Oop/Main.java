package Oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter your name :");
        String name = n.nextLine();

        Op1 u = new Op1(name);

        System.out.println("Your name :" + u.getUsername());

        n.close();
    }
}