package Task2;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir puan giriniz: ");
        int puan = scanner.nextInt();

        char harfNotu;
        if (puan >= 90 && puan <= 100) {
            harfNotu = 'A';
        } else if (puan >= 80 && puan < 90) {
            harfNotu = 'B';
        } else if (puan >= 70 && puan < 80) {
            harfNotu = 'C';
        } else if (puan >= 60 && puan < 70) {
            harfNotu = 'D';
        } else if (puan >= 0 && puan < 60) {
            harfNotu = 'F';
        } else {
            System.out.println("Geçersiz puan girdiniz.");
            scanner.close();
            return;
        }

        System.out.println("Not: " + harfNotu);

        scanner.close();
    }
}
/* 5. Bir üniversite, öğrencilerin aldığı derslere göre notlarını harf notuna çeviren bir Java programı yazmanızı istemektedir.
Program, her bir öğrencinin notunu okuyacak ve aşağıdaki kurallara göre harf notunu belirleyecektir:
	90-100: A
	80-89: B
	70-79: C
	60-69: D
	0-59: F

	Örnek Girdi:
	Bir puan giriniz: 85

	Örnek Çıktı:
	Not: B */