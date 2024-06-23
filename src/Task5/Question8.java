package Task5;
import java.util.ArrayList;

public class Question8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(233);
        numbers.add(54);
        numbers.add(65);
        numbers.add(98);

        System.out.println("Numbers in the ArrayList:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        int sum = calculateSum(numbers);

        System.out.println("Sum of numbers in the ArrayList: " + sum);
    }

    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        return sum;
    }
}
/*
8. Bir ArrayList oluşturun ve içine Integer
 wrapper sınıfı kullanarak birkaç sayı ekleyin. Bu sayıları ekrana yazdırın ve ardından toplamını hesaplayarak ekrana yazdırın.*/