package Op;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter you number :");
		int number = sc.nextInt();
		
		if (number % 2 == 0) {
			System.out.print( "Even");
			}
			else {
				System.out.print("Odd");
		}
		sc.close();
		}
	}