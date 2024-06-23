package Task5;
import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);

        System.out.println("Original ArrayList: " + numbers);

        int indexToReplace = 1;
        int newValue = 42;
        numbers.set(indexToReplace, newValue);

        System.out.println("Updated ArrayList: " + numbers);
    }
}
/*6. Bir ArrayList oluşturun ve içine birkaç sayı ekleyin. Belirli bir indekste bulunan sayıyı başka bir sayıyla değiştirin ve sonucu ekrana yazdırın. */