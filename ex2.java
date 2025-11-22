package Op;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
		System.out.print("Enter you number1 : ");
		double numberOne = sc.nextDouble();
		
		System.out.print("Enter you number2 : ");
		double numberTwo = sc.nextDouble();
		
		double RectangleArea = numberOne * numberTwo;
		
		System.out.println("Your number1: " + numberOne);
        System.out.println("Your number2: " + numberTwo);
        System.out.println("Value of rectangle area: " + RectangleArea);
        
		}catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        }
		sc.close();
	}
}