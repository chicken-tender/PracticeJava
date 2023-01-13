package 백준10807번문제;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon10807 {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수 갯수 입력 받음
        int[] valArr = new int[n];
        for(int i = 0; i < valArr.length; i++) {
            valArr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int e : valArr) {
            if(e == x) cnt++;
        }
        System.out.print(cnt);
    }
}
