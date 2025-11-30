package op2;

import java.util.Scanner;

public class Mt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select unit (degrees Celsius) C_TO_F (degrees Fahrenheit) F_TO_C");
        System.out.print("Enter your select unit :");
        String mode = sc.nextLine();    
        System.out.print("Enter your degrees :");
        double temp = sc.nextDouble();  

        if (mode.equals("C_TO_F")) {
            System.out.println("Your degrees :" + TempConverter.celsiusToFahrenheit(temp) + " F" );
        } else if (mode.equals("F_TO_C")) {
            System.out.println("Your degrees :" + TempConverter.fahrenheitToCelsius(temp) + " C");
        }
    }
}