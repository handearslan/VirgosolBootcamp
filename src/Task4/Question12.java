package Task4;
import java.util.Arrays;

public class Question12 {
    public static void main(String[] args) {
        int[] originalNumbers = {32, 23,13, 2, 56,32, 9, 0, 12, 948};

        int startIndex = 2;
        int endIndex = 5;
        int[] subArray = copySubArray(originalNumbers, startIndex, endIndex);

        System.out.println("Original array: " + Arrays.toString(originalNumbers));
        System.out.println("Subarray: " + Arrays.toString(subArray));
    }

    public static int[] copySubArray(int[] array, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > array.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid start or end index");
        }

        int[] subArray = new int[endIndex - startIndex];

        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = array[startIndex + i];
        }
        return subArray;
    }
}
/*
12) Bir dizinin belirli bir aralıktaki elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metod yazın.*/