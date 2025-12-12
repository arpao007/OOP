package Oop;

import java.util.Scanner;

public class M4 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
        	System.out.print("Number of products : ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
            	System.out.print("Product name " + (i+1) + " : " );
                String productName = sc.nextLine();
                new Op4(productName); 
            }

            System.out.println("Includes all product lists : " + Op4.getProductCount());
        }
    }
}