package op2;

public class Student1 {
    String studentId;
    String name;

    static int studentCount = 0;

    public Student1(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        studentCount++; 
    }
}