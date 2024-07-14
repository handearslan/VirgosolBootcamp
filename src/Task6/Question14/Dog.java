package Task6.Question14;

public class Dog extends Animal {
    public Dog(String type) {
        super(type); // Calling the upper class constructor
    }

    public void displayType() {
        System.out.println("Animal Type: " + type);
    }

    public void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public void showDogType() {
        System.out.println("Dog Type: " + type);
    }
}