package Op8;

import java.util.Scanner;

class Animal {

    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class o1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputName = sc.nextLine();
        int inputAge = sc.nextInt();

        Dog dog = new Dog();

        dog.name = inputName;
        dog.age = inputAge;

        dog.makeSound();
        dog.displayInfo();

        sc.close();
    }
}
