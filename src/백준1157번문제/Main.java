package 백준1157번문제;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] alphabet = new int[26];
        char rst = 0;
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') alphabet[word.charAt(i) - 'a']++;
            else alphabet[word.charAt(i) - 'A']++;
        }
        int max = 0;
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max) rst = '?';
            else if (alphabet[i] > max) {
                max = alphabet[i];
                rst = (char)('A' + i);
            }
        }
        System.out.println(rst);
    }
}