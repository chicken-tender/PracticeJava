package 자동차종합예제;

public class SportsCar extends Car{
    String name;
    SportsCar(String name) {
        carName = name;
        fuelEfficiency = 8;
        speed = 250;
        fuelTank = 30;
        seat = 2;
    }

    @Override
    public void addOption(boolean isOption) {
        if(isOption) speed *= 1.2;
    }
}
