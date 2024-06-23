package Task5;
import java.util.ArrayList;

public class Question9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(233);
        numbers.add(54);
        numbers.add(65);
        numbers.add(98);

        double average = calculateAverage(numbers);

        System.out.println("Average of numbers: " + average);

        System.out.println("Numbers greater than average:");
        for (Integer num : numbers) {
            if (num > average) {
                System.out.println(num);
            }
        }
        System.out.println("Numbers less than or equal to average:");
        for (Integer num : numbers) {
            if (num <= average) {
                System.out.println(num);
            }
        }
    }
    public static double calculateAverage(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }

        return (double) sum / list.size();
    }
}
/* 9. Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin. Bu değerlerin ortalamasını hesaplayın. Ardından, listedeki her
 elemanın ortalamadan büyük mü küçük mü olduğunu kontrol edin ve ortalamanın üstündeki ve altındaki değerleri ayrı ayrı ekrana yazdırın.*/