package Task5;
import java.util.ArrayList;

public class Question13 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(233);
        numbers.add(54);
        numbers.add(65);
        numbers.add(98);

        for (Integer number : numbers) {
            int sumOfDigits = calculateSumOfDigits(number);
            System.out.println("Sum of digits for " + number + ": " + sumOfDigits);
        }
    }
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        int tempNumber = Math.abs(number); // Ensure we work with positive numbers

        while (tempNumber > 0) {
            sum += tempNumber % 10; // Add the last digit to sum
            tempNumber /= 10; // Remove the last digit from number
        }

        return sum;
    }
}
/*13. Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin. Bu Integer değerlerin her birinin rakamlarının toplamını
 hesaplayın ve bu toplamları ekrana yazdırın. Örneğin, listede 123 varsa, rakamların toplamı 6 olmalıdır (1 + 2 + 3). */