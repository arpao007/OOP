package Op7;

class TimePeriod {
    
    private int startHour;
    private int endHour;

    public TimePeriod() {
        this(9, 17);
    }

    public TimePeriod(int startHour, int endHour) {
        if (startHour < 0) startHour = 0;
        if (startHour > 23) startHour = 23;
        if (endHour < 0) endHour = 0;
        if (endHour > 23) endHour = 23;

        if (startHour > endHour) {
            int temp = startHour;
            startHour = endHour;
            endHour = temp;
        }

        this.startHour = startHour;
        this.endHour = endHour;
    }

    public void displayPeriod() {
        System.out.println(startHour + ":00 - " + endHour + ":00");
    }
}

public class Op10 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int mode = sc.nextInt();

        if (mode == 1) {
            TimePeriod t = new TimePeriod();
            t.displayPeriod();
        } else if (mode == 2) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            TimePeriod t = new TimePeriod(s, e);
            t.displayPeriod();
        }

        sc.close();
    }
}
