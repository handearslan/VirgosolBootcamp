package Task5;

public class Question10 {
    public static void main(String[] args) {
        int resultInt = add(65, 2);
        System.out.println("Integer addition result: " + resultInt);

        double resultDouble = add(3.5, 2.5);
        System.out.println("Double addition result: " + resultDouble);

        int a = 12;
        int b = 98;
        double x = 1.5;
        double y = 3.2;

        System.out.println("Adding " + a + " and " + b + ": " + add(a, b));
        System.out.println("Adding " + x + " and " + y + ": " + add(x, y));
        System.out.println("Adding " + a + " and " + x + ": " + add(a, x));
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
}
/* 10. int ve double tipinde iki sayının toplamını bulan
iki farklı metot yazın. Bu metotları kullanarak çeşitli toplama işlemleri yapın ve sonucu ekrana yazdırın.*/