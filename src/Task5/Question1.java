package Task5;
import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Adana");
        cities.add("Mersin");
        cities.add("İstanbul");
        cities.add("İzmir");
        cities.add("Ankara");

        System.out.println("Cities in the ArrayList:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
/* 1. ArrayList sınıfını kullanarak bir ArrayList oluşturun ve içine 5 farklı şehir ekleyin. Bu şehirleri ekrana yazdırın.*/