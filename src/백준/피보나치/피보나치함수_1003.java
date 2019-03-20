package 백준.피보나치;

import java.io.*;

public class 피보나치함수_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[][] arr = new int[41][2];

        arr[0][0] = 1;
        arr[1][1] = 1;
        for (int i = 2; i < 41; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 2][j];
            }
        }

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(arr[num][0] + " " + arr[num][1] + "\n"));
        }
        bw.close();
    }
}