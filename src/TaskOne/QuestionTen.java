package TaskOne;

public class QuestionTen {
    public static void main(String[] args) {
        boolean niceWeather = true;
        boolean enoughMoney = true;

        if (niceWeather && enoughMoney) {
            System.out.println("Ali, akşam yemeğe çıkabilir.");
        } else {
            System.out.println("Ali, akşam yemeğe çıkamaz.");
        }
    }
}

/* 10- Ali ve Veli, bir akşam yemeği için dışarı çıkmayı planlıyorlar. Ali'nin yemeğe çıkabilmesi için iki şart var:
hava güzel olmalı ve Ali'nin yeterli parası olmalı.
Havanın güzel olup olmadığını boolean havaGuzel değişkeni ile,
Ali'nin yeterli parası olup olmadığını ise boolean yeterliPara değişkeni ile temsil ediyoruz.

Java'da bu iki şartın sağlanıp sağlanmadığını kontrol eden ve sonucu ekrana yazdıran bir program yazınız. */
