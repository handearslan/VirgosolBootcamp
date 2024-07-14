package Task7.Question5;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(6);
        Shape rectangle = new Rectangle(10, 24);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}