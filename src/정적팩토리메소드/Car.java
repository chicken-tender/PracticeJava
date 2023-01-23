package 정적팩토리메소드;

public class Car {
    private final String name;
    private final int oil;

    public static Car createCar(String name, int oil) {
        return new Car(name, oil);
    }

    public static Car noOilCar(String name) {
        return new Car(name, 0);
    }

    private Car(String name, int oil) {
        this.name = name;
        this.oil = oil;
    }
}