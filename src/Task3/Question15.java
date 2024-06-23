package Task3;
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " palindromik bir kelimedir.");
        } else {
            System.out.println(word + " palindromik bir kelime değildir.");
        }

        scanner.close();
    }
    public static boolean isPalindrome(String word) {
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
/* 15. Verilen bir string kelimenin  palindromik olup olmadığını bulan bir Java programı yazın.
 Palindromik ileri ve geri okunduğunda aynı olan kelimedir. (Örnek:  kayak) */