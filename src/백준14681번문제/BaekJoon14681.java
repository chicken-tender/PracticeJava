package 백준14681번문제;
import java.util.Scanner;

public class BaekJoon14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요.(x) : ");
        int x = sc.nextInt();
        System.out.print("정수를 입력하세요.(y) : ");
        int y = sc.nextInt();

        if(x > 0 && y > 0) System.out.print("1");
        else if(x < 0 && y > 0) System.out.print("2");
        else if(x < 0 && y < 0) System.out.print("3");
        else System.out.print("4");
    }
}
