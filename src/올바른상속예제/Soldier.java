package 올바른상속예제;

public class Soldier extends Person {
    int serialNum;

    public Soldier(int serialNum, String name, int age, char gender) {
        this.serialNum = serialNum;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void shoot() {
        System.out.println(name + "이 사격하다.");
    }
}
