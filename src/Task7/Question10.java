package Task7;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int numerator = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int denominator = scanner.nextInt();

        try {
            int result = divide(numerator, denominator);
            System.out.println("Sonuç: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Bir sayı sıfıra bölünemez.");
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}