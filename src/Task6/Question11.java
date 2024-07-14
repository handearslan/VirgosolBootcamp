package Task6;

// Book.java
public class Question11 {
    private String title;
    private String author;

    public Question11(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public Question11(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
    }

    public static void main(String[] args) {
        Question11 book1 = new Question11("1984");
        book1.displayInfo();

        Question11 book2 = new Question11("Sol Ayağım", "Christy Brown");
        book2.displayInfo();
    }
}
/* 11-Bir sınıf oluşturun ve bu sınıfta iki farklı constructor tanımlayın. Constructor'lar farklı parametreler alsın (overloading).*/