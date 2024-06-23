package Task5;

import java.util.ArrayList;
import java.util.Collections;

public class Question17 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(233);
        numbers.add(54);
        numbers.add(65);
        numbers.add(98);
        numbers.add(34);
        numbers.add(24);
        numbers.add(1);
        numbers.add(87);
        numbers.add(0);
        numbers.add(94);

        System.out.println("Original list: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted list: " + numbers);

        Collections.reverse(numbers);

        System.out.println("Reversed list: " + numbers);

        ArrayList<Integer> squares = new ArrayList<>();

        for (int num : numbers) {
            squares.add(num * num);
        }

        System.out.println("Squares of numbers: " + squares);
    }
}
/*17. Bir ArrayList oluşturun ve içine 10 farklı tam sayı ekleyin. Bu sayıları küçükten büyüğe sıralayın, ardından sıralanmış
listeyi tersten yazdırın. Son olarak, listedeki her sayının karesini hesaplayarak yeni bir ArrayList içinde saklayın ve bu
listeyi ekrana yazdırın.
 */