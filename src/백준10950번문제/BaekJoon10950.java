package 백준10950번문제;
import java.util.Scanner;

public class BaekJoon10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
           int x = sc.nextInt();
           int y = sc.nextInt();
            System.out.println(x + y);
        }
    }
}
