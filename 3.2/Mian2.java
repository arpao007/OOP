package Oop;

import java.util.Scanner;

public	class Mian2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
        	System.out.print("Please enter the starting score :");
            int initialScore = sc.nextInt();
        	System.out.print("Please enter the updated score :");
            int newScore = sc.nextInt();

            Op2 p = new Op2(initialScore);
            p.setScore(newScore);

            System.out.println("Your latest score :" + p.getScore());
        }
    }
}
