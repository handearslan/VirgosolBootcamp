package Task5;

import java.util.ArrayList;
import java.util.Collections;

public class Question20 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(233.5);
        numbers.add(54.1);
        numbers.add(65.9);
        numbers.add(98.12);

        double max = Collections.max(numbers);
        double min = Collections.min(numbers);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();

        System.out.println("Average value: " + average);

        System.out.println("Comparison with average:");
        for (double num : numbers) {
            if (num > average) {
                System.out.println(num + " is greater than the average");
            } else if (num < average) {
                System.out.println(num + " is less than the average");
            } else {
                System.out.println(num + " is equal to the average");
            }
        }
    }
}
/* 20. Bir ArrayList oluşturun ve içine birkaç Double değer ekleyin. Bu değerlerden en büyük ve en küçük olanını bulun.
 Ardından, listedeki tüm elemanların ortalamasını hesaplayın ve bu ortalamayı ekrana yazdırın. Son olarak, listedeki her elemanı
ortalamadan büyük mü küçük mü diye kontrol edin ve sonuçları ayrı ayrı ekrana yazdırın.*/