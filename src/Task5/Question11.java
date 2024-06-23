package Task5;
import java.util.Arrays;

public class Question11 {
    public static void main(String[] args) {
        int[] numbers = {32, 23, 2, 56, 9, 0, 12, 948};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        sortArray(numbers);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }
}
/* 11. int tipinde bir dizi oluşturun ve bu diziyi sıralayan bir metot yazın. Bu metodu çağırarak sonucu ekrana yazdırın.*/