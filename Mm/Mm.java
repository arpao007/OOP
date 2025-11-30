package Op4;

import java.util.Scanner;

public class Mm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("All products : ");
        int N = sc.nextInt();
        sc.nextLine();

        System.out.println("You entered " + N + " piece(s)");

        Sc cart = new Sc();

        for (int i = 0; i < N; i++) {
            System.out.print("Product name : ");
            String name = sc.nextLine();

            System.out.print("Product price : ");
            double price = Double.parseDouble(sc.nextLine());

            Pd p = new Pd(name, price);
            cart.addProduct(p);
        }

        System.out.println("All product prices: " + cart.calculateTotalPrice());
    }
}