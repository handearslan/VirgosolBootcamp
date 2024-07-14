package Task7;

public class Question7 {
    public static void main(String[] args) {
        System.out.println("Thread is going to sleep for 5 seconds.");

        try {
            Thread.sleep((5000));
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted: " + e.getMessage());
        }

        System.out.println("Thread woke up after 5 seconds!");
    }
}