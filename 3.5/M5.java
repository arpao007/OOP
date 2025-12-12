package Oop;

import java.util.Scanner;

public class M5 {
    public static void main(String[] args) {
        System.out.println("Choose database: 1. ProdDB_Server " + "2. TestDB_Localhost " + "3. Backup_Server ");
        System.out.print("Enter choice : ");
        try (Scanner sc = new Scanner(System.in)) {
            String connectionString = sc.nextLine();
            
            Op5 db = new Op5(connectionString);
            
            db.connect();
            db.disconnect();
            db.disconnect();

            System.out.println(db.isConnected());
        }
    }
}