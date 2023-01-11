package 배열예제_5번;
import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] intArr = new int[100];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<intArr.length; i++) {
            System.out.print("정수 입력 : ");
            intArr[i] = sc.nextInt();
            if(intArr[i] == 0) break;

            count++;
        }
        for(int i = 0; i <= count; i++) {
            System.out.print(intArr[count-i] + " ");
        }
    }
}
