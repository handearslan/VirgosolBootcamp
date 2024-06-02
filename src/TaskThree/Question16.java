package TaskThree;

public class Question16 {
    public static void main(String[] args) {
        String str = "Java bootcampindeyiz.";

        System.out.println("Tekrar etmeyen karakterler:");
        printNonRepeatingCharacters(str);
    }
    public static void printNonRepeatingCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.print(ch + " ");
            }
        }
    }
}
/* 16. Verilen bir string içerisindeki benzersiz karakterleri bulan ve bunları ekrana yazdıran bir Java programı yazın.
 Benzersiz karakterler, string içerisinde sadece bir kez geçen karakterlerdir. */