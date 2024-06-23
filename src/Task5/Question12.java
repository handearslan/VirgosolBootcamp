package Task5;
import java.util.ArrayList;

public class Question12 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("hande");
        words.add("deneme");
        words.add("java");
        words.add("bootcamp");

        // Find the number of occurrences of 'a' in each word and print the result
        char targetChar = 'a';
        for (String word : words) {
            int count = countOccurrences(word, targetChar);
            System.out.println("Number of '" + targetChar + "' in '" + word + "': " + count);
        }
    }
    public static int countOccurrences(String word, char targetChar) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }
}
/* 12. Bir ArrayList oluşturun ve içine birkaç kelime ekleyin. Her kelimenin içindeki belirli bir harfin sayısını bulan bir metot yazın ve sonucu ekrana yazdırın.
 */