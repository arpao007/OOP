package Op8;

import java.util.Scanner;

class Am {

    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Am {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class o2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputName = sc.nextLine();
        int inputAge = sc.nextInt();

        Cat cat = new Cat();

        cat.name = inputName;
        cat.age = inputAge;

        cat.displayInfo();
        cat.makeSound();

        sc.close();
    }
}
