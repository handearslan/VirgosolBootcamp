package Task5;
import java.util.ArrayList;
import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 10 different integers:");

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        scanner.close();

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Numbers entered: " + numbers);
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
/* 16. Bir ArrayList kullanarak kullanıcıdan alınan 10 farklı tam sayıyı saklayın.
 Bu tam sayılardan kaç tanesinin çift, kaç tanesinin tek olduğunu bulan ve sonucu ekrana yazdıran bir program yazın.*/