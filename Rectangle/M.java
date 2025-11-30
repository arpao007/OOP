package op2;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your width :");
        double width = sc.nextDouble();
        System.out.print("Enter your height :");
        double height = sc.nextDouble();

        Rectangle r = new Rectangle(width, height);

        System.out.println("Your Area :" + r.getArea());
        System.out.println("Your Perimeter :" + r.getPerimeter());
        
        sc.close();
    }
}