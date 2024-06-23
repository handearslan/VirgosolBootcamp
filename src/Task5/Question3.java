package Task5;
import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Object> values = new ArrayList<>();

        values.add(92);
        values.add(7.8);
        values.add(true);

        System.out.println("Values in the ArrayList:");
        for (Object value : values) {
            System.out.println(value);
        }
    }
}
/*3. int, double ve boolean tiplerinde 3 farklı değeri tutan bir ArrayList oluşturun ve bu değerleri ekrana yazdırın. */