package 팩터리메소드패턴연습;

public class Main {
    public static void main(String[] args) {
        Animal doggy = new Dog();
        AnimalToy toyBall = doggy.getToy();
        toyBall.identify();
    }
}
