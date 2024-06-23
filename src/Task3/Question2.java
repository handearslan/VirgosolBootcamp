package Task3;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı girin: ");
        int number = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(number + "! = " + factorial);

        scanner.close();
    }
}
/* 2. Bir sayının faktöriyelini for döngüsü kullanarak hesaplayan bir Java programı yazın. Örneğin, 5'in faktöriyeli 120'dir. */