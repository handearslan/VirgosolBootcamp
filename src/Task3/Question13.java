package Task3;

public class Question13 {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        int sumOfPalindromes = 0;

        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                sumOfPalindromes += i;
            }
        }

        System.out.println("1 ile 1000 arasındaki palindromik sayıların toplamı: " + sumOfPalindromes);
    }
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverseNumber;
    }
}
/*13. Bir aralık belirleyerek (örneğin 1 ile 1000 arası) bu aralıktaki palindromik sayıların
 toplamını hesaplayan bir Java programı yazın.
Palindromik sayılar, aynı şekilde okunan sayılardır (örneğin 121, 131). */