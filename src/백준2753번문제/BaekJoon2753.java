package 백준2753번문제;
import java.util.Scanner;

public class BaekJoon2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요. : ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.print("1");
        else System.out.print("0");
    }
}
