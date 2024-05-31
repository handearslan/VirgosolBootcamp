package TaskTwo;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci cümleyi giriniz: ");
        String cumle1 = scanner.nextLine();

        System.out.print("İkinci cümleyi giriniz: ");
        String cumle2 = scanner.nextLine();

        String uzunCumle = (cumle1.length() > cumle2.length()) ? cumle1 : cumle2;

        System.out.println("Uzun olan cümle: " + uzunCumle);

        scanner.close();
    }
}
/* 10. Girilen iki cümleden uzun olanı bulan bir program yazın.

	Örnek Girdi:
	Birinci cümleyi giriniz: Merhaba Dünya
	İkinci cümleyi giriniz: Java programlama dili

	Örnek Çıktı:
	Uzun olan cümle: Java programlama dili */