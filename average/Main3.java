package op2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Student name :");
            String name = sc.nextLine();
            
            System.out.print("midtermScore :");
            int mid = sc.nextInt();

            System.out.print("finalScore :");
            int fin = sc.nextInt();

            Student2 st = new Student2(name, mid, fin);
            st.displaySummary();

        }
    }
}