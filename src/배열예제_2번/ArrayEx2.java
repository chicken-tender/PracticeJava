package 배열예제_2번;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        char[] charArr = new char[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< charArr.length; i++) {
            System.out.print("문자를 입력하세요. : ");
            charArr[i] = sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(charArr));
    }
}
