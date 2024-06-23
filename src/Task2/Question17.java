package Task2;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();

        int kare = sayi * sayi;

        int kup = sayi * sayi * sayi;

        System.out.println("Karesi: " + kare);
        System.out.println("Küpü: " + kup);
        scanner.close();
    }
}
/* 17. Bir tam sayının karesini ve küpünü hesaplayan bir Java programı yazınız. Program, girdiyi almalı ve çıktı olarak karesini ve küpünü göstermelidir.

   Örnek Girdi:
   Bir tam sayı giriniz: 3

   Örnek Çıktı:
   Karesi: 9
   Küpü: 27
   */