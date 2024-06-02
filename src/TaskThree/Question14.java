package TaskThree;

public class Question14 {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;

        System.out.println(start + " ile " + end + " arasındaki Armstrong sayıları:");

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return originalNumber == sum;
    }
}
/*
14. Belirli bir aralıktaki tüm Armstrong sayıları bulan bir Java programı yazın.
 Bir sayının Armstrong sayısı olup olmadığını kontrol eden bir algoritma yazın.
Armstrong sayısı, n basamaklı bir sayının, basamaklarının n’inci kuvvetleri
 toplamına eşit olduğu sayıdır (örneğin 153 = 1³ + 5³ + 3³). */