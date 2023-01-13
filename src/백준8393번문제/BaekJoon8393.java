package 백준8393번문제;
import java.util.Scanner;

public class BaekJoon8393 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
