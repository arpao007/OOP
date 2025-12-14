package Oop;

import java.util.Scanner;

public class M4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = readProductCount(sc);
            readProducts(sc, n);
            printResult();
        }
    }

    private static int readProductCount(Scanner sc) {
        System.out.print("Number of products : ");
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    private static void readProducts(Scanner sc, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Product name " + (i + 1) + " : ");
            String productName = sc.nextLine();
            new Op4(productName);
        }
    }

    private static void printResult() {
        System.out.println("Includes all product lists : " + Op4.getProductCount());
    }
}
