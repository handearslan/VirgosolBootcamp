package Task5;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int[] numbers = {32, 23, 2, 56, 9, 0, 12, 948};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check in the array: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(target + " exists in the array.");
        } else {
            System.out.println(target + " does not exist in the array.");
        }
        scanner.close();
    }
}
/* 4. int tipinde bir dizi oluşturun ve kullanıcıdan bir sayı alın. Bu sayının dizide olup olmadığını kontrol edin ve sonucu ekrana yazdırın.*/