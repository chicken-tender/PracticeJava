package 백준10810번문제;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n];

        for(int a = 0; a < m; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int c = i - 1; c < j; c++) {
                    basket[i-1] = k;
                    i++;
            }
        }
        for(int e : basket) System.out.print(e + " ");
    }
}
