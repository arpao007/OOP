package Op3;

import java.util.Scanner;

public class Mad {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

        	System.out.print("Enter your name :");
            String name = sc.nextLine();    
            System.out.print("street :");
            String street = sc.nextLine();  
            System.out.print("city :");
            String city = sc.nextLine();   
            System.out.print("zip :");
            String zip = sc.nextLine();      

            Ad address = new Ad(street, city, zip);
            Sd student = new Sd(name, address);

            student.displayProfile();
        }
    }
}