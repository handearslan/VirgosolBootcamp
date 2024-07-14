package Task6;

public class Question3 {
    String name;
    int age;

    public Question3(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        Question3 student = new Question3("Hande", 25);
    }
}
