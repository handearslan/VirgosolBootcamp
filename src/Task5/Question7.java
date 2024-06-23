package Task5;
import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int[] numbers = {32, 23, 2, 56, 9, 0, 12, 948};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        reverseArray(numbers);

        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
/*
7. int tipinde bir dizi oluşturun ve bu diziyi tersine çeviren bir metot yazın. Bu metodu çağırarak sonucu ekrana yazdırın. */