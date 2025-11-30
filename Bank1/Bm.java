package op2;

import java.util.Scanner;

public class Bm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name :");
        String owner = sc.nextLine();       
        System.out.print("Your initial :");
        double initial = sc.nextDouble();
        System.out.print("First withdrawal :");
        double w1 = sc.nextDouble();      
        System.out.print("Second withdrawal :");
        double w2 = sc.nextDouble();        

        Banka acc = new Banka(owner, initial);

        acc.withdraw(w1);  
        acc.withdraw(w2);   
        acc.displayBalance(); 
    }
}