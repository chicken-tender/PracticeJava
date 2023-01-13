package 백준25304번문제;
import java.util.Scanner;

public class BaekJoon25304 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("총 금액 : ");
        int total = sc.nextInt(); // 영수증에 적힌 총 금액
        int n = sc.nextInt(); // 물건 n개 구매
        for(int i = 0; i < n; i++) {
            int price = sc.nextInt(); // 물건의 가격
            int num = sc.nextInt(); // 물건의 개수
            sum += price * num;
        }
        if(total == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
