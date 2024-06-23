package Task1;

public class QuestionFour {
    public static void main(String[] args) {
        // Define Ali's information
        String name = "Hande";
        int age = 25;
        double height = 1.6;
        double bankAccount = 41561.51;

        // Print the information with special characters for new lines and tabs
        System.out.println("Benim adım " + name + ".\tYaşım: " + age + "\nBoyum: " + height + " metre.\tBanka hesabımda " + bankAccount + " TL para var.");
    }
}
/* 4- Aşağıdaki açıklamaları dikkate alarak, özel karakterlerin kullanımıyla ilgili bir Java programı yazınız. Programda, Ali'nin adını, yaşını, boyunu ve banka hesabındaki para miktarını ekrana yazdırınız.
Her bilgi satırını yeni bir satıra geçecek şekilde ve her bilgi arasında bir tab boşluğu olacak şekilde yazdırınız.

Açıklamalar:
- `\n`: Yeni satır. Sonraki satırın başına gider.
- `\t`: Tab tuşu. Sonraki tab sekmesine kadar imleci götürür.

İstenen Çıktı:

Benim adım Ali.    Yaşım: 23
Boyum: 1.86 metre.    Banka hesabımda 41561.51 TL para var.


Bu işlevi yerine getiren Java kodunu yazınız. */