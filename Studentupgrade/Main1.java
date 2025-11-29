package Op;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter ID: " );
		String id =sc.nextLine();
		
		System.out.print("Enter Name: ");
		String name =sc.nextLine();
		
		Studentupgrade s = new Studentupgrade(id,name);
		
		s.displayInfo();
	}

}
