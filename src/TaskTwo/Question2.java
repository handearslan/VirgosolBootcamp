package TaskTwo;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");

        String kelime = scanner.nextLine();
        int uzunluk = kelime.length();
        System.out.println("Kelimenin uzunluğu: " + uzunluk);

        scanner.close();
    }
}
/* 2. Kullanıcıdan bir kelime girmesini isteyen ve kelimenin uzunluğunu ekrana yazdıran programı yazınız.

   Örnek Girdi:
   Bir kelime giriniz: merhaba

   Örnek Çıktı:
   Kelimenin uzunluğu: 7 */