package Op7;

import java.util.Scanner;

class ScoreBoard {
    private final String gameName;
    private final int[] scores;

    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores;
    }

    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length];
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScores() {
        System.out.println(gameName + ": " + scores[0] + ", " + scores[1] + ", " + scores[2]);
    }
}

public class Op14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String game = sc.nextLine();
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int edit = sc.nextInt();

        int[] originalScores = { s1, s2, s3 };

        ScoreBoard sb1 = new ScoreBoard(game, originalScores);
        ScoreBoard sb2 = new ScoreBoard(sb1);

        originalScores[0] = edit;

        sb1.displayScores();
        sb2.displayScores();
    }
}
