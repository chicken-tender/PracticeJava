package 입출력스트림_자동차예제;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Car> car = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/입출력스트림_자동차예제/CarInfo.txt");
        Scanner sc = new Scanner(fis);
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] carArr = line.split(" ");
            car.add(new Car.Builder(carArr[2],Integer.parseInt(carArr[4])).company(carArr[0]).type(carArr[1]).
                    year(Integer.parseInt(carArr[3])).oilType(carArr[5]).fuelEff(Double.parseDouble(carArr[6])).build());
        }
        for(Car e : car) {
            System.out.println("이름 : " + e.getName());
            System.out.println("연식 : " + e.getYear() + "년");
            System.out.println("가격 : " + e.getPrice() + "원");
            System.out.println("연비 : " + e.getFuelEff() + "km/ℓ");
            System.out.println("============================");
        }
    }
}
