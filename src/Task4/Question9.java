package Task4;

public class Question9 {
    public static void main(String[] args) {
        int[] numbers = {32, 23,32, 2, 56,32, 9, 0, 12, 948};

        int value = 32;
        int count = countOccurrences(numbers, value);

        System.out.println("The value " + value + " occurs " + count + " times in the array.");
    }

    public static int countOccurrences(int[] numbers, int value) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                count++;
            }
        }
        return count;
    }
}
/* 9) Bir dizide belirli bir değere sahip kaç adet eleman olduğunu bulan bir metod yazın.*/