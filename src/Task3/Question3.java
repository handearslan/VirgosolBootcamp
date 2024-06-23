package Task3;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int limit = scanner.nextInt();

        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Serisi: " + num1 + " " + num2);

        int nextNum = num1 + num2;

        while (nextNum <= limit) {
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
            nextNum = num1 + num2;
        }
        scanner.close();
    }
}
/*
3. Kullanıcıdan alınan bir sayıya kadar Fibonacci serisini while döngüsü kullanarak yazdıran bir Java programı yazın.
*/