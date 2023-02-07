package 백준2908번문제;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        for(int i = 2; i >= 0; i--) {
            if(n1.charAt(i) - '0' != n2.charAt(i) - '0') {
                if(n1.charAt(i) - '0' > n2.charAt(i) - '0') {
                    System.out.print(""+n1.charAt(2)+n1.charAt(1)+n1.charAt(0));
                    break;
                } else {
                    System.out.print(""+n2.charAt(2)+n2.charAt(1)+n2.charAt(0));
                    break;
                }
            } else continue;
        }
    }
}
