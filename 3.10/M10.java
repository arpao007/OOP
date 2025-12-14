package Oop;

import java.util.Scanner;

public class M10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();

            if (command.equals("SET")) {
                int level = Integer.parseInt(sc.nextLine());
                Op10.setLogLevel(level);

            } else if (command.equals("LOG")) {
                int level = Integer.parseInt(sc.nextLine());
                String message = sc.nextLine();
                Op10.log(level, message);
            }
        }

        sc.close();
    }
}
