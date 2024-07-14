package Task7;

// Main.java
public class Question8 {
    public static void main(String[] args) {
        System.out.println("Thread is going to sleep for 5 seconds.");

        try {
            sleepThread();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted: " + e.getMessage());
        }

        System.out.println("Thread woke up after 5 seconds!");
    }

    public static void sleepThread() throws InterruptedException {
        Thread.sleep(5000);
    }
}