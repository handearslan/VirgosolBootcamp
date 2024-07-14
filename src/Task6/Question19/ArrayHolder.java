package Task6.Question19;

public class ArrayHolder {
    private int[] numbers;

    public ArrayHolder(int size) {
        numbers = new int[size];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumber(int index, int value) {
        if (index >= 0 && index < numbers.length) {
            numbers[index] = value;
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public void displayArray() {
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}