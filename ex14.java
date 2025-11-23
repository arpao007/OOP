package Op;
import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = readInt(sc, "Enter number of rows : ");
        int cols = readInt(sc, "Enter number of columns : ");

        char[][] map = readMap(sc, rows, cols);

        int targetR = readInt(sc, "Enter target row (0-indexed): ");
        int targetC = readInt(sc, "Enter target column (0-indexed): ");

        processCell(map, targetR, targetC);

        sc.close();
    }

    private static int readInt(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    private static char[][] readMap(Scanner sc, int rows, int cols) {
        sc.nextLine(); 
        char[][] map = new char[rows][cols];

        System.out.println("Enter the map row by row (* for mine, . for empty):");

        for (int i = 0; i < rows; i++) {
            String row;
            while (true) {
                row = sc.nextLine();
                if (row.length() == cols) break;
                System.out.println("Row length must be " + cols + ". Enter again:");
            }
            map[i] = row.toCharArray();
        }
        return map;
    }

    private static void processCell(char[][] map, int r, int c) {
        if (isMine(map, r, c)) {
            System.out.println("Mine");
        } else {
            System.out.println(countAdjacentMines(map, r, c));
        }
    }

    private static boolean isMine(char[][] map, int r, int c) {
        return map[r][c] == '*';
    }

    private static int countAdjacentMines(char[][] map, int r, int c) {
        int rows = map.length;
        int cols = map[0].length;
        int count = 0;

        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) continue;

                int nr = r + dr;
                int nc = c + dc;

                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                    if (map[nr][nc] == '*') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}