package Task6;

// Calculator.java
public class Question9 {
    private int num1;
    private int num2;

    public Question9(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void calculateSum() {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Question9 calculator = new Question9(23, 43);

        calculator.calculateSum();
    }
}
/* 9-Bir sınıf oluşturun ve bu sınıfta iki değişken tanımlayın. Bu değişkenlerin toplamını bir metod içinde hesaplayın ve ekrana yazdırın.*/