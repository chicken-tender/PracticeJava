package 배열예제_4번;

import java.util.Scanner;
// 최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램 작성
public class ArrayEx4 {
    public static void main(String[] args) {
        int[] valueArr = new int[100];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<valueArr.length; i++) {
            System.out.print("정수 입력 : ");
            valueArr[i] = sc.nextInt();
            if(valueArr[i] == 0) break;
            count++;
        }
        for(int i=1; i<count; i++) {
            if(i % 2 != 0) System.out.print(valueArr[i] + " ");
        }
    }
}