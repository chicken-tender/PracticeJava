package 배열예제_3번;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] valueArr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< valueArr.length; i++) {
            System.out.print("정수 값 입력하세요. : ");
            valueArr[i] = sc.nextInt();
        }
        System.out.printf("%d, %d, %d",valueArr[2],valueArr[4],valueArr[9]);
    }
}
