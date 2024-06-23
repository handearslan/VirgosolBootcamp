package Task4;
import java.util.Arrays;

public class Question14 {
    public static void main(String[] args) {
        int[] originalNumbers = {32, 23,13, 2, 56,32, 9, 0, 12, 948};

        int[] oddNumbersArray = extractOddNumbers(originalNumbers);

        System.out.println("Original array: " + Arrays.toString(originalNumbers));
        System.out.println("Odd numbers array: " + Arrays.toString(oddNumbersArray));
    }

    public static int[] extractOddNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        int[] oddNumbers = new int[count];
        int index = 0;

        for (int num : array) {
            if (num % 2 != 0) {
                oddNumbers[index++] = num;
            }
        }
        return oddNumbers;
    }
}
/* 14) Bir dizideki tek sayıları bulan ve bunları başka bir diziye ekleyen bir metod yazın.*/