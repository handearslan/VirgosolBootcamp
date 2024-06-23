package Task5;
import java.util.ArrayList;
import java.util.Collections;

public class Question14 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(233);
        numbers.add(54);
        numbers.add(65);
        numbers.add(98);

        int minNumber = findMinimum(numbers);
        int maxNumber = findMaximum(numbers);

        System.out.println("Numbers in the ArrayList: " + numbers);
        System.out.println("Minimum number: " + minNumber);
        System.out.println("Maximum number: " + maxNumber);
    }
    public static int findMinimum(ArrayList<Integer> list) {
        return Collections.min(list);
    }
    public static int findMaximum(ArrayList<Integer> list) {
        return Collections.max(list);
    }
}
/*
14. Bir ArrayList oluşturun ve içine birkaç sayı ekleyin. Bu sayılar arasından en küçük ve en büyük sayıları bulun ve sonucu ekrana yazdırın.*/