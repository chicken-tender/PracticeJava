package 백준11720번문제;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = null;
        int sum = 0;
        int num = sc.nextInt();
        while(true) {
            number = sc.next();
            if(number.length() == num) break;
        }
        for(int i = 0; i < num; i++) {
            sum += number.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
