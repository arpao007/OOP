package Op6;

public class Std{
    private String studentName;
    private C enrolledCourse;

    public Std(String studentName, C enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}