package 백준2675번문제;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> c = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int repeatCnt = sc.nextInt();
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                c.add(str.charAt(j));
                for (int k = 0; k < repeatCnt; k++) {
                    System.out.print("" + c.get(j));
                }
            }
            c.clear();
            System.out.println();
        }
    }
}
