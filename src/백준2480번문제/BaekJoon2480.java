package 백준2480번문제;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2480 {
    public static void main(String[] args) {
        int[] dice = new int[3];
        int max;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < dice.length; i++) {
            dice[i] = sc.nextInt();
        }
        max = dice[0];
        for(int e : dice) {
            if(e > max) max = e;
        }

        if(dice[0] == dice[1] && dice[1] == dice[2]) System.out.print(10000 + (dice[0] * 1000));
        else if(dice[0] == dice[1] || dice[0] == dice[2]) System.out.print(1000 + (dice[0] * 100));
        else if(dice[1] == dice[2]) System.out.print(1000 + (dice[1] * 100));
        else System.out.print(max * 100);
    }
}
