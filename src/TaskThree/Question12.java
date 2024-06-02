package TaskThree;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        System.out.print(number + " sayısının asal çarpanları: ");

        int count = 0;

        while (number % 2 == 0) {
            System.out.print("2 ");
            number /= 2;
            count++;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
                count++;
            }
        }
        if (number > 2) {
            System.out.print(number);
            count++;
        }

        System.out.println("\nToplam asal çarpan sayısı: " + count);

        scanner.close();
    }
}
/* 12. Bir sayının asal çarpanlarını bulan bir Java programı yazın.
Kullanıcının girdiği bir sayının asal çarpanlarını ve bu çarpanların sayısını ekrana yazdırın. */