package Task5;
import java.util.Random;

public class Question2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        double average = calculateAverage(numbers);

        int countAboveAverage = countNumbersAboveAverage(numbers, average);

        System.out.println("Array of 100 random numbers created.");
        System.out.println("Average of the numbers: " + average);
        System.out.println("Number of elements above average: " + countAboveAverage);
    }

    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static int countNumbersAboveAverage(int[] array, double average) {
        int count = 0;
        for (int num : array) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }
}
/*2. 100 adet rastgele sayının bulunduğu bir dizi oluşturun. Bu sayıların ortalamasını hesaplayın ve ortalamadan büyük olan sayıların kaç tane olduğunu bulun. */