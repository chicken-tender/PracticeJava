package 인터페이스분리원칙;

public class Main {
    public static void main(String[] args) {
        Person kim = new Student(2023, "김학생", 18, 'F');
        Student studentKim = (Student)kim;
        studentKim.study();
    }
}
