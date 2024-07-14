package Task7.Question6;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
    @Override
    public void move() {
        System.out.println("The dog runs.");
    }
}