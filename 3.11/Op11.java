package Oop;

import java.util.Scanner;

class SystemConfig {
    private static SystemConfig instance;
    private String url;
    private int maxConnections;

    private SystemConfig() {
        url = "default.server.com";
        maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMaxConnections(int count) {
        if (count <= 0) {
            System.out.println("Invalid count.");
        } else {
            maxConnections = count;
            System.out.println("Max connections set.");
        }
    }

    public void show() {
        System.out.println("URL: " + url);
        System.out.println("MAX: " + maxConnections);
    }
}

public class Op11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SystemConfig config = SystemConfig.getInstance();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String cmd = sc.nextLine();

            if (cmd.equals("SHOW")) {
                config.show();
            } else if (cmd.equals("SET_URL")) {
                config.setUrl(sc.nextLine());
            } else if (cmd.equals("SET_MAX")) {
                config.setMaxConnections(Integer.parseInt(sc.nextLine()));
            }
        }
        sc.close();
    }
}