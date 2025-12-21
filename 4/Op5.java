package Op7;

class Color {
    
    private final int red;
    private final int green;
    private final int blue;

    public Color(int r, int g, int b) {
        red = (r < 0) ? 0 : (r > 255 ? 255 : r);
        green = (g < 0) ? 0 : (g > 255 ? 255 : g);
        blue = (b < 0) ? 0 : (b > 255 ? 255 : b);
    }

    public int getRed() {
        return red; 
    }

    public int getGreen() {
        return green; 
    }

    public int getBlue() {
        return blue; 
    }

    public void displayRGB() {
        System.out.println("R=" + red + ", G=" + green + ", B=" + blue);
    }
}

public class Op5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        Color c = new Color(r, g, b);
        c.displayRGB();
        
        sc.close();
    }
}
