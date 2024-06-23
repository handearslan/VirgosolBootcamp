package Task2;

public class Question9 {
    public static void main(String[] args) {
        // 'abc' metnindeki karakterler
        String metin = "abc";

        // Her bir karakterin ASCII değerini ekrana yazdıran döngü
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            int asciiDegeri = (int) karakter;
            System.out.println("Karakter: " + karakter + ", ASCII Değeri: " + asciiDegeri);
        }
    }
}
/* /* 9.  'abc' metinindeki ASCII değerlerini ekrana yazdıran programı yazınız.

    Örnek Çıktı:
	Karakter: a, ASCII Değeri: 97
	Karakter: b, ASCII Değeri: 98
	Karakter: c, ASCII Değeri: 99 */