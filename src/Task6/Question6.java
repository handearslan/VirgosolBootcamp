package Task6;

public class Question6 {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Question6 mathOps = new Question6();

        int sum1 = mathOps.add(5, 10);
        System.out.println("Sum of two numbers: " + sum1);

        int sum2 = mathOps.add(5, 10, 15);
        System.out.println("Sum of three numbers: " + sum2);
    }
}
/* 6-Bir sınıf oluşturun ve bu sınıfta iki farklı metot tanımlayın. Bu metotlar aynı isme sahip olsun ama farklı parametreler alsın (overloading).*/