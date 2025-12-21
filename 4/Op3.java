package Op7;

import java.util.Scanner;

class Player {
    private String username;
    private int level;

    public Player() {
        this.username = "Guest";
        this.level = 1;
    }

    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}

public class Op3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mode = sc.nextInt();
        sc.nextLine();
        if (mode == 1) {
            Player p = new Player();
            p.displayProfile();
        } else if (mode == 2) {
            String username = sc.nextLine();
            int level = sc.nextInt();
            Player p = new Player(username, level);
            p.displayProfile();
        }
        sc.close();
    }
}
