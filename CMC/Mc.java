package Op6;

import java.util.Scanner;

public class Mc {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        	System.out.print("Course Id :");
            String courseId = sc.nextLine();
            System.out.print("Course Name :");
            String courseName = sc.nextLine();
            System.out.print("Student Name :");
            String studentName = sc.nextLine();

            C course = new C(courseId, courseName);
            Std student = new Std(studentName, course);

            student.displayEnrollment();

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}