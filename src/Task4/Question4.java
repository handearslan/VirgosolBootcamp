package Task4;

public class Question4 {
    public static void main(String[] args) {
        int[] numbers = {32, 23, 2, 56, 9, 0, 12, 948};

        int minNumber = findMin(numbers);

        System.out.println("Dizideki en küçük eleman: " + minNumber);
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
/*4) Bir diziyi parametre olarak alan ve dizideki en küçük elemanı bulan bir metod yazın. */