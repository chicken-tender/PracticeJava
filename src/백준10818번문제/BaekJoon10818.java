package 백준10818번문제;

import java.util.Scanner;

public class BaekJoon10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int e : arr) {
            if(e > max) max = e;
            if(e < min) min = e;
        }
        System.out.print(min + " ");
        System.out.print(max);
    }
}
