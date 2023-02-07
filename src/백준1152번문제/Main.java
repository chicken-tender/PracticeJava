package 백준1152번문제;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = str.trim();
        int cnt = 0;
        for(int i = 0; i < str2.length(); i++) {
            if(str.length() == 1 && str.charAt(i) == ' ') break;
            else if(str2.charAt(i) == ' ') cnt++;
        }
        if(str.length() == 1 && str.charAt(0) == ' ')System.out.println(cnt);
        else System.out.println(cnt + 1);
    }
}
