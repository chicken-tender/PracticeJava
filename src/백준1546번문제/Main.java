package 백준1546번문제;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grade = new int[n];
        double average;
        double sum = 0;
        for(int i = 0; i < n; i++) {
            grade[i] = sc.nextInt();
        }
        int max = grade[0];
        for(int e : grade) {
            if(e > max) max = e;
        }
        for(int i = 0; i < n; i++) {
            sum += (double)(grade[i]) / max * 100;
        }
        average = sum / n;
        System.out.print(average);
    }
}
