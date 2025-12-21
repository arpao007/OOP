package Op7;

class Movie {
    
    private String title;
    private String director;
    private double rating;

    public Movie(String title) {
        this(title, "Unknown");
    }

    public Movie(String title, String director) {
        this(title, director, 0.0);
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        if (rating > 10.0) rating = 10.0;
        if (rating < 0.0) rating = 0.0;
        this.rating = rating;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Director: " + director + ", Rating: " + rating);
    }
}

public class Op8 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int mode = sc.nextInt();
        sc.nextLine();

        if (mode == 1) {
            String t = sc.nextLine();
            Movie m = new Movie(t);
            m.displayDetails();
        } else if (mode == 2) {
            String t = sc.nextLine();
            String d = sc.nextLine();
            Movie m = new Movie(t, d);
            m.displayDetails();
        } else if (mode == 3) {
            String t = sc.nextLine();
            String d = sc.nextLine();
            double r = sc.nextDouble();
            Movie m = new Movie(t, d, r);
            m.displayDetails();
        }

        sc.close();
    }
}
