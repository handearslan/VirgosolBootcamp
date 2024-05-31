package TaskTwo;
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir gezegen adı giriniz: ");
        String gezegen = scanner.nextLine();

        switch (gezegen.toLowerCase()) {
            case "merkür":
            case "venüs":
            case "dünya":
            case "mars":
                System.out.println("İç gezegen");
                break;
            case "jüpiter":
            case "satürn":
            case "uranüs":
            case "neptün":
                System.out.println("Dış gezegen");
                break;
            default:
                System.out.println("Geçersiz gezegen adı");
        }
        scanner.close();
    }
}
/* 18. Bir Astronom, gezegenleri sınıflandırmak için bir program geliştirmek istiyor. Kullanıcıdan girilen gezegen adıyla gezegenin iç gezegen mi yoksa dış gezegen mi olduğunu belirlemesi gerekiyor. Astronomun bu programı yazmasına yardımcı olun.
	Not1: İÇ GEZEGENLER --> Merkür, Venüs, Dünya ve Mars.
		  DIŞ GEZEGENLER --> Jüpiter, Satürn, Uranüs ve Neptün
	Not2: Switch-case kullanarak yazınız.

    Örnek Girdi:
    Bir gezegen adı giriniz: Dünya

    Örnek Çıktı:
    İç gezegen */