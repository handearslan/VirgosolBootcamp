package TaskThree;

public class Question11 {
    public static void main(String[] args) {
        String str = "Java bootcampindeyiz.";
        int length = str.length();

        System.out.println("Tekrar eden karakterler:");

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);

            for (int j = i + 1; j < length; j++) {
                if (currentChar == str.charAt(j)) {
                    System.out.println(currentChar);
                    break;
                }
            }
        }
    }
}
/* 11. For döngüsü kullanarak bir String ifadede tekrar eden karakterleri bulan bir Java programı yazın. */