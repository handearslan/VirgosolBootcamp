package Task5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int randomNum = random.nextInt(100); // Generate random integer between 0 and 99
            numbers.add(randomNum);
        }
        System.out.println("Original ArrayList: " + numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find pairs with sum 100: ");
        int userNumber = scanner.nextInt();

        scanner.close();
    }

}
/* TEKRAR BAKICAM YAPAMADIM */
/* 19. Bir ArrayList oluşturun ve içine 20 rastgele tam sayı ekleyin. Kullanıcıdan bir sayı alın ve
 bu sayının listedeki elemanlarla toplamının 100 olduğu tüm çiftleri bulun ve ekrana yazdırın.*/