package Task7.Question4;

public class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping.");
    }
}