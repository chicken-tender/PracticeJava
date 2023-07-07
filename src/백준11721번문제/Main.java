package 백준11721번문제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();
        String word = sc.nextLine();
        while(true) {
            if(word.length() >= 10) {
                wordList.add(word.substring(0,10));
                word = word.substring(10,word.length());
            } else {
                wordList.add(word);
                break;
            }
        }
        for(String e : wordList) System.out.println(e);
    }
}
