package TaskOne;

public class QuestionNine {
    public static void main(String[] args) {

        double aliPrice = 123.456;
        int aliIntegerPrice = (int) aliPrice;

        double veliSavings = 130.2;
        byte veliByteSavings = (byte) veliSavings;

        double totalPrice = aliIntegerPrice + veliByteSavings;

        System.out.println("Ali'nin fiyatı (ondalık): " + aliPrice);
        System.out.println("Ali'nin fiyatı (tam sayı): " + aliIntegerPrice);
        System.out.println("Veli'nin birikimleri (ondalık): " + veliSavings);
        System.out.println("Veli'nin birikimleri (byte): " + veliByteSavings);
        System.out.println("Toplam fiyat: " + totalPrice);
    }
}
/* 9- Ali ve Veli, marketten alışveriş yaparken aldıkları ürünlerin fiyatlarını hesaplamak istiyorlar.
Ali, bir ürünün fiyatını 123.456 TL olarak görüyor. Ancak Ali, ondalık kısmı görmek istemiyor ve bu fiyatı tam sayı olarak dönüştürmek istiyor.
Veli ise, kendi birikimlerini tam sayı olarak hesapladıktan sonra byte cinsine dönüştürmek istiyor.
Son olarak, Ali ve Veli aldıkları ürünlerin toplam fiyatını hesaplamak istiyorlar.

Ali ve Veli'nin bu dönüşümleri yaparak toplam fiyatı hesaplayan bir Java programı yazınız. */
