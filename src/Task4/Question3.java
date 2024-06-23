package Task4;

public class Question3 {
    public static void main(String[] args) {

        int[] numbers = {32, 23, 2, 56, 9, 0, 12,948};

        int maxNumber = findMax(numbers);

        System.out.println("Dizideki en büyük eleman: " + maxNumber);
    }
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
/*
3) Bir diziyi parametre olarak alan ve dizideki en büyük elemanı bulan bir metod yazın.*/