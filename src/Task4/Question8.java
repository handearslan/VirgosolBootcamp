package Task4;
import java.util.Arrays;
import java.util.Collections;

public class Question8 {
    public static void main(String[] args) {
        Integer[] numbers = {32, 23, 2, 56, 9, 0, 12, 948};
        sortArrayDescending(numbers);

        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));
    }

    public static void sortArrayDescending(Integer[] numbers) {
        Arrays.sort(numbers, Collections.reverseOrder());
    }
}
/*8) Bir dizinin elemanlarını büyükten küçüğe sıralayan bir metod yazın. */