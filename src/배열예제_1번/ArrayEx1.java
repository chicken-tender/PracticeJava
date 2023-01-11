package 배열예제_1번;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        int value;
        Scanner sc = new Scanner(System.in);
        int[] fiveValue = new int[5];
        for(int i=0; i<fiveValue.length; i++) {
            System.out.print("정수 값 입력하세요. : ");
            fiveValue[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(fiveValue));
    }
}
