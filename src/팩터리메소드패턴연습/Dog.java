package 팩터리메소드패턴연습;

public class Dog extends Animal {
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
