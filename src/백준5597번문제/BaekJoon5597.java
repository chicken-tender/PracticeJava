package 백준5597번문제;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaekJoon5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>(30);
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30));
        for(int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            arr.add(n);
        }
       arr2.removeAll(arr); // arr2과 arr 중 중복되지 않는 값만 출력됨.
       if(arr2.get(0) < arr2.get(1)) {
           System.out.println(arr2.get(0));
           System.out.println(arr2.get(1));
       } else {
           System.out.println(arr2.get(1));
           System.out.println(arr2.get(0));
       }
    }
}
