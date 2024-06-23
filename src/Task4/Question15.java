package Task4;

public class Question15 {
    public static void main(String[] args) {
        int[] numbers = {32, 23,32, 2, 56,32, 9, 0, 12, 948};

        int sum = sumArray(numbers);

        System.out.println("Sum of the elements in the array: " + sum);
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return sum;
    }
}
/*15) Bir dizideki elemanları birbirine toplayan ve sonucu döndüren bir metod yazın. */