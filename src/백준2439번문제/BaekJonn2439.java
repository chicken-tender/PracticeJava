package 백준2439번문제;
import java.util.Scanner;

public class BaekJonn2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            for(int j = 0; j < i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = n; i > 0; i--) {
//            for(int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j == n-1 || j >= (n-i)-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
