package 올바른상속예제;

public class Student extends Person {
    int studentID;

    public Student(int studentID, String name, int age, char gender) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void study() {
        System.out.println(name + "이 공부한다." );
    }
}
