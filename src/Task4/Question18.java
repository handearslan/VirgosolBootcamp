package Task4;

public class Question18 {
    public static void main(String[] args) {
        int[] numbers = {32, 23,32, 2, 56,32, 9, 0, 12, 948};

        int target = 9;
        int newValue = 10;

        boolean updated = updateElement(numbers, target, newValue);

        if (updated) {
            System.out.println("Element " + target + " updated to " + newValue + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        System.out.println("Updated array: " + java.util.Arrays.toString(numbers));
    }

    public static boolean updateElement(int[] numbers, int target, int newValue) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                numbers[i] = newValue;
                return true;
            }
        }
        return false;
    }
}
/*
18) Bir dizinin belirli bir elemanını bulup güncelleyen bir metod yazın.
(ipucu: method ayrıca eleman dizide varsa ve güncelleme gerçekleşirse true, yoksa false dönsün)*/
