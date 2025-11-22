package Op;
import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int R = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int C = sc.nextInt();
        sc.nextLine(); 

        char[][] map = new char[R][C];

        System.out.println("Enter the map row by row (* for mine, . for empty):");
        for (int i = 0; i < R; i++) {
            String row;
            while (true) {
                row = sc.nextLine();
                if (row.length() == C) break;
                System.out.println("Row length must be " + C + ". Enter again:");
            }
            for (int j = 0; j < C; j++) {
                map[i][j] = row.charAt(j);
            }
        }

        System.out.print("Enter target row (0-indexed): ");
        int targetR = sc.nextInt();
        System.out.print("Enter target column (0-indexed): ");
        int targetC = sc.nextInt();

        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
        } else {
            int mineCount = 0;
            for (int dr = -1; dr <= 1; dr++) {
                for (int dc = -1; dc <= 1; dc++) {
                    if (dr == 0 && dc == 0) continue;
                    int newR = targetR + dr;
                    int newC = targetC + dc;

                    if (newR >= 0 && newR < R && newC >= 0 && newC < C) {
                        if (map[newR][newC] == '*') {
                            mineCount++;
                        }
                    }
                }
            }
            System.out.println(mineCount);
        }

        sc.close();
    }
}