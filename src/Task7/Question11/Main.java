package Task7.Question11;

public class Main {
    public static void main(String[] args) {
        System.out.println("School Name: " + School.schoolName);

        int age = 25;
        boolean isEligible = School.isFavorForBeingStudent(age);
        System.out.println( isEligible);
    }
}