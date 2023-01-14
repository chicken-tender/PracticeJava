package 백준2562번문제;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaekJoon2562 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            int n = sc.nextInt();
            arr.add(n);
        }
        int max = arr.indexOf(0);
        for(int e : arr) {
            if(e > max) max = e;
        }
        System.out.println(max);
        System.out.println(arr.indexOf(max)+1);
    }
}