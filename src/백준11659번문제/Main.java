package 백준11659번문제;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n]; // 입력 받은 수의 배열
        long[] sum = new long[n]; // 구간합을 적용한 배열. 수가 커질 수 있어 long으로..

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(i == 0) sum[i] = a[i];
            else sum[i] = sum[i-1] + a[i];
        }
        int start = 0;
        int end = 0;

        while(m != 0) {
            start = sc.nextInt();
            end = sc.nextInt();
            if(start != 1) System.out.println(sum[end - 1] - sum[start - 2]);
            else System.out.println(sum[end - 1]);
            m--;
        }
    }
}
