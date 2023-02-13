package 백준5622번문제;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] s = {3,4,5,6,7,8,9,10};
        int val = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'C') val += s[0];
            else if(str.charAt(i) >= 'D' && str.charAt(i) <= 'F') val += s[1];
            else if(str.charAt(i) >= 'G' && str.charAt(i) <= 'I') val += s[2];
            else if(str.charAt(i) >= 'J' && str.charAt(i) <= 'L') val += s[3];
            else if(str.charAt(i) >= 'M' && str.charAt(i) <= 'O') val += s[4];
            else if(str.charAt(i) >= 'P' && str.charAt(i) <= 'S') val += s[5];
            else if(str.charAt(i) >= 'T' && str.charAt(i) <= 'V') val += s[6];
            else val += s[7];
        }
        System.out.println(val);
    }
}
