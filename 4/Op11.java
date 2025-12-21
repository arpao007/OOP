package Op7;

import java.util.Scanner;

class Configuration {
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        if (fontSize < 10) fontSize = 10;
        if (fontSize > 20) fontSize = 20;
        this.theme = theme;
        this.fontSize = fontSize;
        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }

    public void displaySettings() {
        System.out.println("Theme: " + theme + ", Size: " + fontSize + ", Dark: " + darkMode);
    }
}

public class Op11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String baseTheme = sc.nextLine();
        int baseSize = sc.nextInt();
        boolean baseDark = sc.nextBoolean();
        sc.nextLine();

        String userTheme = sc.nextLine();
        int userSize = sc.nextInt();
        boolean userDark = sc.nextBoolean();

        Configuration baseConfig = new Configuration(baseTheme, baseSize, baseDark);
        Configuration userConfig = new Configuration(userTheme, userSize, userDark);
        Configuration finalConfig = new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();
        sc.close();
    }
}
