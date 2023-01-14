package 백준10871번문제;
import java.util.Scanner;

public class BaekJoon10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] nArr = new int[n];
        for(int i = 0; i < nArr.length; i++) {
            nArr[i] = sc.nextInt();
        }
        for(int e : nArr) {
            if(e < x) System.out.print(e + " ");
        }
    }
}
