package 백준8958번문제;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            int sum = 0;
            for(int j = 0; j < str[i].length(); j++) {

                if(str[i].charAt(j) == 'O') cnt++;
                else cnt = 0;
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}
