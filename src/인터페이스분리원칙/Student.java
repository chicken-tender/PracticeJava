package 인터페이스분리원칙;

public class Student extends Person implements Studiable{
    int studentID;

    public Student(int studentID, String name, int age, char gender) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void study() {
        System.out.println(name + "이 공부한다.");
    }
}
