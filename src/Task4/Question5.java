package Task4;

public class Question5 {
    public static void main(String[] args) {
        int[] numbers = {32, 23, 2, 56, 9, 0, 12, 948};

        int sum = calculateSum(numbers);

        System.out.println("Dizideki elemanların toplamı: " + sum);
    }
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
/* 5) Bir diziyi parametre olarak alan ve dizideki elemanların toplamını bulan bir metod yazın.*/