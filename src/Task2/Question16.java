package Task2;

public class Question16 {
    public static void main(String[] args) {
        String metin = "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.";

        String yeniMetin = metin.replace("kötü", "iyi").replace(".", "!");

        System.out.println(yeniMetin);
    }
}
/*
16. Ali, yazdığı romanın bazı bölümlerinde "kötü" kelimesini "iyi" ile ve '.' karakterini '!' karakteri ile değiştirmek istemektedir.
Aşağıda verilen metin üzerinde bu değişiklikleri yapacak bir Java programı yazınız:
Girdi metni: "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir."

   Örnek Girdi:
   Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.

   Örnek Çıktı:
   Bu iyi bir hikaye! Ancak, Ali'nin çabalarıyla daha iyi olabilir! */