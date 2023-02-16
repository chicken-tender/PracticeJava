package 백준2750번문제;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> ti = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            ti.add(sc.nextInt());
        }
        for(Integer e : ti) System.out.println(e);
    }
}
