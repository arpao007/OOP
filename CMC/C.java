package Op6;

public class C {
    private String courseId;
    private String courseName;

    public C(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseInfo() {
        return courseId + ": " + courseName;
    }
}