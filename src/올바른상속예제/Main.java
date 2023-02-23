package 올바른상속예제;

public class Main {
    public static void main(String[] args) {
        Person kim = new Student(202301, "김학생", 18, 'F');
        Person lee = new Soldier(160320, "이군인", 22, 'M');
        Student park = new Student(2,"박경림", 32, 'F');

        Student s = (Student)kim;
        Soldier m = (Soldier)lee;

        s.study();
        m.shoot();
        park.walk();
    }
}
