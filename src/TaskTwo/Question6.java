package TaskTwo;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        if (cumle.length() < 50) {
            System.out.println("Kısa bir cümle");
        }
        scanner.close();
    }
}
/* 6. Kullanıcıdan bir cümle girmesini isteyen ve eğer cümlenin uzunluğu 50'den küçükse "Kısa bir cümle" mesajını yazdıran programı yazınız.

   Örnek Girdi:
   Bir cümle giriniz: Merhaba, nasılsınız?

   Örnek Çıktı:
   Kısa bir cümle
*/