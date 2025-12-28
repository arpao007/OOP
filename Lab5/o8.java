package Op8;

import java.util.Scanner;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getStatus() {
        return "Person: " + name;
    }
}

class Student extends Person {
    protected int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + studentId;
    }
}

class Em extends Person {
    protected double salary;

    public Em(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus) {
        salary += bonus;
    }

    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}

public class o8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentName = sc.nextLine();
        int studentId = Integer.parseInt(sc.nextLine());

        String employeeName = sc.nextLine();
        double salary = Double.parseDouble(sc.nextLine());

        Person s = new Student(studentName, studentId);
        Person e = new Em(employeeName, salary);

        Person[] people = { s, e };

        for (Person p : people) {
            if (p instanceof Em) {
                Em emp = (Em) p;
                emp.applyBonus(1000.0);
            }
        }

        for (Person p : people) {
            System.out.println(p.getStatus());
        }

        sc.close();
    }
}
