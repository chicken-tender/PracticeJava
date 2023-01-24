package 백준10809번문제;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 알파벳 갯수만큼 배열 생성
        int[] alphabet = new int[26];
        // 알파벳 배열 값을 -1로 초기화
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (alphabet[ch - 'a'] == -1) {
                alphabet[ch - 'a'] = i;
            }
        }
        for(int e : alphabet) {
            System.out.print(e + " ");
        }
    }
}

