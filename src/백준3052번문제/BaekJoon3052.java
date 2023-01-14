package 백준3052번문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BaekJoon3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> arr = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            int n = (Integer.parseInt(br.readLine()) % 42);
            arr.add(n);
        }
        System.out.println(arr.size());
    }
}

