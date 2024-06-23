package Task5;
import java.util.ArrayList;

public class Question15 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("hande");
        words.add("deneme");
        words.add("java");
        words.add("bootcamp");

        words.add(0, "ders");

        words.add("array");

        System.out.println("Original ArrayList: " + words);


    }
}
/*
15. Bir ArrayList oluşturun ve içine
birkaç kelime ekleyin. Listenin başına ve sonuna yeni kelimeler ekleyin, ardından listeyi sıralayın ve sonucu ekrana yazdırın.*/