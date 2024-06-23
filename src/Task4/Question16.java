package Task4;
import java.util.Arrays;

public class Question16 {
    public static void main(String[] args) {
        int[] numbers1 = {34, 14, 954};
        int[] numbers2 = {1, 0, 89, 94 , 32843};

        int[] mergedArray = mergeArrays(numbers1, numbers2);

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] numbers1, int[] numbers2) {
        int mergedLength = numbers1.length + numbers2.length;
        int[] mergedArray = new int[mergedLength];

        for (int i = 0; i < numbers1.length; i++) {
            mergedArray[i] = numbers1[i];
        }

        for (int i = 0; i < numbers2.length; i++) {
            mergedArray[numbers1.length + i] = numbers2[i];
        }
        return mergedArray;
    }
}
/*16) İki diziyi birleştiren ve yeni bir dizi oluşturan bir metod yazın.
(ipucu: method iki adet parametre (int[] dizi1, int[] dizi2) alıyor)*/