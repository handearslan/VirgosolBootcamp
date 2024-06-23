package Task5;

import java.util.ArrayList;
import java.util.Collections;

public class Question18 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("hande");
        words.add("deneme");
        words.add("java");
        words.add("bootcamp");

        System.out.println("Original ArrayList: " + words);

        ArrayList<Integer> lengths = new ArrayList<>();

        for (String word : words) {
            lengths.add(word.length());
        }

        System.out.println("Lengths of words: " + lengths);

        Collections.sort(lengths);

        System.out.println("Sorted lengths: " + lengths);

        int shortestLength = lengths.get(0);
        int longestLength = lengths.get(lengths.size() - 1);

        String shortestWord = "";
        String longestWord = "";

        for (String word : words) {
            if (word.length() == shortestLength) {
                shortestWord = word;
            }
            if (word.length() == longestLength) {
                longestWord = word;
            }
        }

        System.out.println("Shortest word: " + shortestWord + " (length: " + shortestLength + ")");
        System.out.println("Longest word: " + longestWord + " (length: " + longestLength + ")");
    }
}
/* 18. Bir ArrayList oluşturun ve içine birkaç kelime ekleyin. Her kelimenin uzunluğunu tutan bir ArrayList daha oluşturun ve
 bu uzunlukları sıralı olarak ekrana yazdırın. Son olarak, en uzun ve en kısa kelimeleri bularak ekrana yazdırın.*/