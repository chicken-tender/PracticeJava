package 백준15552번문제;
import java.util.Scanner;

public class BaekJoon15552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            System.out.println(x + y);
        }
    }
}
