package op2;

public class Student2 {
    private String name;
    private int midtermScore;
    private int finalScore;

    public Student2(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }

    public void displaySummary() {
        double avg = calculateAverage();
        System.out.println("Name: " + name);
        System.out.println("Average Score: " + avg);
        System.out.println("Status: " + (avg >= 50 ? "Pass" : "Fail"));
    }
}
