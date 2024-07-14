package Task6;

public class Question10 {
    private String name;
    private double price;

    public Question10(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }

    public static void main(String[] args) {
        Question10 product = new Question10("Microwave", 1242.44);
    }
}