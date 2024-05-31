package TaskTwo;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int carpim = sayi1 * sayi2;
        System.out.println("Sayıların çarpımı: " + carpim);

        scanner.close();
    }
}
/* 3. Kullanıcıdan iki tam sayı girmesini isteyen ve bu sayıların çarpımını ekrana yazdıran programı yazınız.

   Örnek Girdi:
   İlk sayıyı giriniz: 4
   İkinci sayıyı giriniz: 5

   Örnek Çıktı:
   Sayıların çarpımı: 20
   */