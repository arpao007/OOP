package op2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students : ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 0; i < n; i++) {
            System.out.print("studentId number " + (i+1) + ": ");
            String id = sc.nextLine();

            System.out.print("Student name " + (i+1) + ": ");
            String name = sc.nextLine();

            Student1 s = new Student1(id, name);
        }

        System.out.println("Total number of students created : " + Student1.studentCount);
    }
}