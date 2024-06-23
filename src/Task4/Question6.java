package Task4;

public class Question6 {
    public static void main(String[] args) {
        int[] numbers = {32, 23, 2, 56, 9, 0, 12, 948};

        double average = calculateAverage(numbers);

        System.out.println("Dizideki elemanların ortalaması: " + average);
    }
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
/* 6) Bir diziyi parametre olarak alan ve dizideki elemanların ortalamasını bulan bir metod yazın.*/