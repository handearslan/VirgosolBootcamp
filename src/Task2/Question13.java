package Task2;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");

        String metin = scanner.nextLine();
        System.out.print("Aranacak karakter: ");
        char karakter = scanner.next().charAt(0);

        int pozisyon = -1;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == karakter) {
                pozisyon = i + 1;
                break;
            }
        }

        if (pozisyon != -1) {
            System.out.println("Karakter '" + karakter + "' " + pozisyon + ". pozisyonda bulunuyor.");
        } else {
            System.out.println("Karakter '" + karakter + "' metinde bulunamadı.");
        }
        scanner.close();
    }
}
/* 13. Kullanıcıdan bir metin ve bir karakter girmesini isteyen ve metindeki karakterin pozisyonunu bulan bir program yazınız.

	Örnek Girdi:
	Bir metin giriniz: Merhaba Dünya
	Aranacak karakter: a

	Örnek Çıktı:
	Karakter 'a' 4. pozisyonda bulunuyor. */