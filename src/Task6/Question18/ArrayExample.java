package Task6.Question18;

public class ArrayExample {
    private int[] numbers;

    public ArrayExample(int size) {
        numbers = new int[size];
    }

    public void updateArray() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10; // Elemanları güncelleme
        }
    }

    public void displayArray() {
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}