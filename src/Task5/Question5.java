package Task5;

public class Question5 {
    public static void main(String[] args) {
        int[] numbers = {32, 23, 2, 56, 9, 0, 12, 948};

        int maxNumber = findMax(numbers);

        System.out.println("The maximum number in the array is: " + maxNumber);
    }

    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
/* 5. int tipinde bir dizi oluşturun ve bu dizideki en büyük sayıyı bulan bir metot yazın. Bu metodu çağırarak sonucu ekrana yazdırın.
 */