package Task3;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Bir sayı girin (Çıkmak için 0'a basın): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Girilen sayıların toplamı: " + sum);
        scanner.close();
    }
}
/*
9. Kullanıcıdan alınan sayılarla toplama işlemi yapan ve kullanıcı 0 girene kadar
devam eden do-while döngüsü kullanan bir Java programı yazın. */