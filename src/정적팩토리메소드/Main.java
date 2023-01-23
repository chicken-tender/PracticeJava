package 정적팩토리메소드;

public class Main {
    public static void main(String[] args) {
        Car car = Car.noOilCar("기름 없는 자동차");
        Car car2 = Car.createCar("테슬라", 200);
    }
}
