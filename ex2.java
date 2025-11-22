package Op;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you number1 : ");
		double number1 = sc.nextDouble();
		
		System.out.print("Enter you number2 : ");
		double number2 = sc.nextDouble();
		
		double Rectangle = number1 * number2;
		System.out.print("is you number1 :"+ number1 + "\n" +"it you number2 :" +number2 + "\n" + "Value of a rectangle :" + Rectangle );
		}

}
