package Task4;

public class Question17 {
    public static void main(String[] args) {
        int[] numbers = {32, 23,32, 2, 56,32, 9, 0, 12, 948};

        int target = 2;

        boolean found = containsElement(numbers, target);

        if (found) {
            System.out.println("Element " + target + " exists in the array.");
        } else {
            System.out.println("Element " + target + " does not exist in the array.");
        }
    }

    public static boolean containsElement(int[] numbers, int target) {
        for (int num : numbers) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
/* 17) Bir dizide belirli bir elemanın bulunup bulunmadığını kontrol eden bir metod yazın.
(ipucu method true veya false olarak değer dönmeli)*/
