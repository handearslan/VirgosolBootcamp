package TaskThree;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        int sum = 0;
        int remainingNumber = number;

        while (remainingNumber != 0) {
            int digit = remainingNumber % 10;
            sum += digit;
            remainingNumber /= 10;
        }

        System.out.println("Sayının basamakları toplamı: " + sum);

        scanner.close();
    }
}
/* 8. Bir sayının basamaklarını toplayan ve while döngüsü kullanan bir Java programı yazın. */