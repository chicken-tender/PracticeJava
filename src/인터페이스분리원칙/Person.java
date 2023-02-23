package 인터페이스분리원칙;

public class Person {
    String name;
    int age;
    char gender;

    public void walk() {
        System.out.println(name + "이 걷는다.");
    }
}
