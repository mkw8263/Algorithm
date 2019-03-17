
package 백준.DP;

import java.io.*;

public class 계단오르기_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] arr = new int[count + 1];
        int[] dp = new int[count + 1];
        for (int i = 1; i <= count; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        dp[2] = dp[1] + arr[2];

        for (int i = 3; i <= count; i++) {
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
        }
        bw.write(String.valueOf(dp[count]));
        bw.close();
    }
}
