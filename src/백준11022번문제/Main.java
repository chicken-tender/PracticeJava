package 백준11022번문제;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            String a = s.split(" ")[0];
            String b = s.split(" ")[1];
            int c = Integer.parseInt(s.split(" ")[0]);
            int d = Integer.parseInt(s.split(" ")[1]);
            bw.write("Case #" + (i+1) + ": ");
            bw.write(a + " + " + b + " = ");
            bw.write(c + d + "\n");
        }
        bw.flush();
    }
}
