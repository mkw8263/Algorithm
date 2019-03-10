package 백준.피보나치;

import java.io.*;

public class 피보나치수_5_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(fibonacci(Integer.parseInt(br.readLine()))));
        bw.close();
    }

    private static int fibonacci(int start) {
        if (start == 0) {
            return 0;
        }
        if (start == 1) {
            return 1;
        }
        return fibonacci(start - 1) + fibonacci(start - 2);
    }
}
