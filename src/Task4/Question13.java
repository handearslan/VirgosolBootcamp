package Task4;
import java.util.Arrays;

public class Question13 {
    public static void main(String[] args) {
        int[] originalNumbers = {32, 23,13, 2, 56,32, 9, 0, 12, 948};

        int[] evenNumbersArray = extractEvenNumbers(originalNumbers);

        System.out.println("Original array: " + Arrays.toString(originalNumbers));
        System.out.println("Even numbers array: " + Arrays.toString(evenNumbersArray));
    }

    public static int[] extractEvenNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbers = new int[count];
        int index = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers[index++] = num;
            }
        }

        return evenNumbers;
    }
}
/* 13) Bir dizideki çift sayıları bulan ve bunları başka bir diziye ekleyen bir metod yazın.*/