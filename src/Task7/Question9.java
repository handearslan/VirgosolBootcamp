package Task7;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir tamsayı girin: ");

        int number = scanner.nextInt();

        try {
            checkNumber(number);
            System.out.println("Girdiğiniz sayı: " + number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkNumber(int number) throws Exception {
        if (number == 0) {
            throw new Exception("Yanlış sayı girdiniz: Sıfır geçersiz bir değerdir.");
        }
    }
}