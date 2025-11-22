package Op;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 = Americano");
        System.out.println("2 = Latte");
        System.out.println("3 = Espresso");
        System.out.println("4 = Mocha");
        System.out.print("Enter your menu choice: ");

        int menu = sc.nextInt();

        if (menu < 1 || menu > 4) {
            System.out.println("Error: Invalid Menu");
        } else if (menu == 1) {
            System.out.println("You menu is Americano");
        } else if (menu == 2) {
            System.out.println("You menu is Latte");
        } else if (menu == 3) {
            System.out.println("You menu is Espresso");
        } else if (menu == 4) {
            System.out.println("You menu is Mocha");
        }

        sc.close();
    }
}