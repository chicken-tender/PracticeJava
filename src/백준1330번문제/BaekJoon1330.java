package 백준1330번문제;
import java.util.Scanner;
// 두 수 비교하기
public class BaekJoon1330 {
    public static void main(String[] args) {
        int A,B;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요.(A) : ");
        A = sc.nextInt();
        System.out.print("정수를 입력하세요.(B) : ");
        B = sc.nextInt();

        if(A > B) System.out.print(">");
        else if(A < B) System.out.print("<");
        else System.out.print("==");
    }
}
