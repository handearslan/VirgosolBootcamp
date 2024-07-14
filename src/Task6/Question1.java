package Task6;

public class Question1 {
    String name;
    int age;

    public void Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
/* Bir sınıf oluşturun ve bu sınıfa ait bir nesne oluşturun. Nesnenin bir özelliğini ekrana yazdırın. */