package Task3;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            sum += digit;
        }

        System.out.println("Sayının basamakları toplamı: " + sum);
        scanner.close();
    }
}
/* 10. For döngüsü kullanarak bir sayının basamaklarını toplayan bir Java programı yazın. */