package 백준10988번문제;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int[] wordArr = new int[word.length()];
        int[] tmpArr = new int[word.length()];
        int isSame = 0;
        for(int i = 0; i < wordArr.length; i++) {
            wordArr[i] = word.charAt(i) - 'a';
            tmpArr[i] = word.charAt((wordArr.length-i)-1) - 'a';
        }
        for(int i = 0; i < word.length(); i++) {
            if(wordArr[i] == tmpArr[i]) isSame++;
            else {
                System.out.println(0);
                return;
            }
        }
        if(isSame == word.length()) System.out.println(1);
    }
}
