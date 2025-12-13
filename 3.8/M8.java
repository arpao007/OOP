package Oop;

import java.util.Scanner;

public class M8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter initial stock: ");
        int initialStock = sc.nextInt();

        Op8 item = new Op8(productName, initialStock);

        System.out.print("Enter number of commands: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Enter command (ADD/SELL) and amount: ");
            String command = sc.next();
            int amount = sc.nextInt();

            if (command.equals("ADD")) {
                item.addStock(amount);
            } else if (command.equals("SELL")) {
                item.sellStock(amount);
            } else {
                System.out.println("Invalid command.");
            }
        }

        System.out.println("Final Stock: " + item.getStock());
        sc.close();
    }
}