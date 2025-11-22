package Op;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of rows (Row): ");
            int R = sc.nextInt();
            System.out.print("Enter number of columns (Column): ");
            int C = sc.nextInt();

            if (R <= 0 || C <= 0) {
                System.out.println("Error: Rows and Columns must be positive integers.");
            } else {
                int[][] grid = new int[R][C];

                System.out.println("Enter the status of each server (0=Offline, 1=Online):");
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        grid[i][j] = sc.nextInt();
                        if (grid[i][j] != 0 && grid[i][j] != 1) {
                            System.out.println("Invalid input! Only 0 or 1 is allowed.");
                            j--; 
                        }
                    }
                }

                int onlineCount = 0;
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        if (grid[i][j] == 1) {
                            onlineCount++;
                        }
                    }
                }

                System.out.println("Number of Online servers: " + onlineCount);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers (0 or 1).");
        }

        sc.close();
    }
}