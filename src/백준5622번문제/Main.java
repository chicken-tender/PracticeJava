package 백준5622번문제;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] s = {3,4,5,6,7,8,9,10};
        int val = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'C') val += s[0];
            else if(word.charAt(i) >= 'D' && word.charAt(i) <= 'F') val += s[1];
            else if(word.charAt(i) >= 'G' && word.charAt(i) <= 'I') val += s[2];
            else if(word.charAt(i) >= 'J' && word.charAt(i) <= 'L') val += s[3];
            else if(word.charAt(i) >= 'M' && word.charAt(i) <= 'O') val += s[4];
            else if(word.charAt(i) >= 'P' && word.charAt(i) <= 'S') val += s[5];
            else if(word.charAt(i) >= 'T' && word.charAt(i) <= 'V') val += s[6];
            else val += s[7];
        }
        System.out.println(val);
    }
}
