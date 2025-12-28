package Op8;

import java.util.Scanner;

class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {

    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {

    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class o5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Shape c = new Circle("Circle", radius);
        Shape r = new Rectangle("Rectangle", width, height);

        Shape[] shapes = new Shape[2];
        shapes[0] = c;
        shapes[1] = r;

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calculateArea());
        }

        sc.close();
    }
}
