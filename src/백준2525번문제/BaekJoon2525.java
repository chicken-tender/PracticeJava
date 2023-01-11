package 백준2525번문제;
import java.util.Scanner;

public class BaekJoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시 : ");
        int h = sc.nextInt();
        System.out.print("분 : ");
        int m = sc.nextInt();
        System.out.print("소요 시간 : ");
        int time = sc.nextInt();

        int tt = (h * 60) + m + time;
        h = tt / 60;
        m = tt % 60;
        if(h >= 24) h = h - 24;

        System.out.printf("%d시 %d분",h,m);
    }
}
