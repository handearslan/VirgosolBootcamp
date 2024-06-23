package Task4;
import java.util.Arrays;

public class Question19 {
    public static void main(String[] args) {
        int[] numbers = {32, 23,32, 2, 56,32, 9, 0, 12, 948};

        int target = 9;

        int[] newArray = removeElement(numbers, target);

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("New array after removing element " + target + ": " + Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] numbers, int target) {
        int count = 0;
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }
        if (count == 0) {
            return numbers;
        }
        int[] newArray = new int[numbers.length - count];
        int index = 0;

        for (int num : numbers) {
            if (num != target) {
                newArray[index++] = num;
            }
        }
        return newArray;
    }
}
/* 19) Bir dizide belirli bir elemanı silen ve yeni bir dizi döndüren bir metod yazın.
(ipucu: yeni dizinin boyutu bir azalmalı)*/
