package Oop;

public class Op4 {
    private String name;               
    private static int productCount = 0; 

    public Op4(String name) {
        this.name = name;
        productCount++;             
    }

    public String getName() {
        return name;
    }

    public static int getProductCount() {
        return productCount;
    }
}