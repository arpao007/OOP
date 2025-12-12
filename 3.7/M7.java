package Oop;

import java.util.Scanner;

public class M7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Employee ID : ");
        String empId = sc.nextLine();
        System.out.print("Enter your Old department : ");
        String oldDept = sc.nextLine();
        System.out.print("Enter your New department : ");
        String newDept = sc.nextLine();

        Op7 e = new Op7(empId, oldDept);

        e.setDepartment(newDept);

        System.out.println("You Employee ID : " + e.getEmployeeId());
        System.out.println("You New department : " + e.getDepartment());
    }
}