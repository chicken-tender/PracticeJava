package 백준1110번문제;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        while(true) {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            cnt++;
            if (t == n) break;
        }
        System.out.print(cnt);
    }
}

