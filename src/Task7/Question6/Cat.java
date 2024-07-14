package Task7.Question6;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow!");
    }

    @Override
    public void move() {
        System.out.println("The cat walks gracefully.");
    }
}