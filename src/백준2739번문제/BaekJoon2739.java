package 백준2739번문제;
import java.util.Scanner;

public class BaekJoon2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        for(int i = num; i <= num; i++){
            for(int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n",i,j,(i * j));
            }
            System.out.println();
        }
    }
}
