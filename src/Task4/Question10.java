package Task4;

public class Question10 {
    public static void main(String[] args) {
        int[] numbers = {32, 23,32, 2, 56,32, 9, 0, 12, 948};
        int value = 32;
        int index = findIndex(numbers, value);

        if (index != -1) {
            System.out.println("The value " + value + " is found at index " + index + ".");
        } else {
            System.out.println("The value " + value + " is not found in the array.");
        }
    }

    public static int findIndex(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
/* 10) Bir dizide belirli bir değeri arayan ve bulunduğu indeksi döndüren bir metod yazın.*/