package Task4;

public class Question11 {
    public static void main(String[] args) {
        int[] originalNumbers = {32, 23,32, 2, 56,32, 9, 0, 12, 948};

        int[] copiedNumbers = copiedNumbers(originalNumbers);

        System.out.println("Original array: " + java.util.Arrays.toString(originalNumbers));
        System.out.println("Copied array: " + java.util.Arrays.toString(copiedNumbers));
    }

    public static int[] copiedNumbers(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
}
/* 11) Bir dizinin elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metod yazın.*/