package 백준10813번문제;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i, j;
        int[] temp = new int[1];
        int[] nArr = new int[n];
        for(int l = 0; l < n; l++) {
            nArr[l] = l+1;
        }
        for(int k = 0; k < m; k++) {
            i = sc.nextInt();
            j = sc.nextInt();
            temp[0] = nArr[i-1];
            nArr[i-1] = nArr[j-1];
            nArr[j-1] = temp[0];
        }
        for(int e : nArr) System.out.print(e + " ");
    }
}
