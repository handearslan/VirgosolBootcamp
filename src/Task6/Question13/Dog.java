package Task6.Question13;

public class Dog extends Animal {
    public Dog(String type) {
        super(type);
    }

    public void displayType() {
        System.out.println("Animal Type: " + type);
    }

    public void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}