package 백준4344번문제;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        int student = 0;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i = 0; i < testCase; i++) {
            student = sc.nextInt();
            arr = new int[student];
            double sum = 0;

            for(int j = 0; j < student; j++) {
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }
            double average = sum / student;
            cnt = 0;

            for(int e : arr) {
                if(e > average) cnt++;
            }
            System.out.printf("%.3f%%\n",((double)cnt/student)*100);
        }
    }
}
