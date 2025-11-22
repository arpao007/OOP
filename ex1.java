package Op;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you number1 : ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter you number2 : ");
		int number2 = sc.nextInt();
		
		int sum = number1 + number2;
		System.out.print("is you number1 :"+ number1 + "\n" +"it you number2 :" +number2 + "\n" + "sum :" + sum );
		}

}
