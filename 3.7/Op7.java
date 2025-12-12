package Oop;

public class Op7 {
    private String employeeId;
    private String department;

    public Op7(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}