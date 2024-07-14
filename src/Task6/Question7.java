package Task6;

public class Question7 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Question7 person = new Question7();

        person.setName("Hande");

        System.out.println("Person Name: " + person.getName());
    }
}
/* 7-Bir sınıf oluşturun ve bu sınıfta private bir değişken tanımlayın. Bu değişkeni getter ve setter metodları ile güncelleyin ve ekrana yazdırın.*/