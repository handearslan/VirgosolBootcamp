package Task4;
import java.util.Arrays;

public class Question20 {
    public static void main(String[] args) {
        String str = "java dersindeyiz";

        char[] charArray = stringToCharArray(str);

        System.out.println("Original string: " + str);
        System.out.println("Character array: " + Arrays.toString(charArray));
    }

    public static char[] stringToCharArray(String str) {
        char[] charArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        return charArray;
    }
}
/*20) String bir ifadenin tüm karakterlerini bir diziye karakter karakter aktaran bir method yazın.
Method parametre olarak String almalı, return olarak dizi dönmeli. */