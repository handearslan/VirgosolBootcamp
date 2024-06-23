package Task4;

import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int[] numbers = {32, 23, 2, 56, 9, 0, 12, 948};
        sortArray(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void sortArray(int[] numbers) {
        Arrays.sort(numbers);
    }
}
/* 7) Bir dizinin elemanlarını küçükten büyüğe sıralayan bir metod yazın.*/