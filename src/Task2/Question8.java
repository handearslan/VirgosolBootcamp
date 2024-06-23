package Task2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("Sayı hem 3 hem de 5 ile bölünebilir");
        } else {
            System.out.println("Sayı hem 3 hem de 5 ile bölünebilir değildir");
        }

        scanner.close();
    }
}
/* 8. Kullanıcıdan bir tam sayı girmesini isteyen ve bu sayının 3 ve 5 ile bölünebilir olup olmadığını belirten programı yazınız.

   Örnek Girdi:
   Bir tam sayı giriniz: 15


   Örnek Çıktı:
   Sayı hem 3 hem de 5 ile bölünebilir */