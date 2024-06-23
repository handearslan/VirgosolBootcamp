package Task2;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ay numarası giriniz (1-12): ");
        int ay = scanner.nextInt();

        switch (ay) {
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz mevsimindesiniz.");
                break;
            default:
                System.out.println("Yaz mevsiminde değilsiniz.");
                break;
        }
        scanner.close();
    }
}
/* 12. Kullanıcıdan bir ay numarası girmesini isteyen ve bu ayın yaz mevsiminde olup olmadığını belirleyen programı yazınız.
Not: Switch-case kullanarak yazınız.

	Örnek Girdi:
	Bir ay numarası giriniz (1-12): 7

	Örnek Çıktı:
	Yaz mevsimindesiniz. */