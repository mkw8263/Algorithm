package 백준.DP;

import java.io.*;
import java.util.StringTokenizer;

public class 정수삼각형_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[][] list = new int[count + 1][count + 1];

        int sum = 0;
        StringTokenizer stringTokenizer;
        for (int i = 1; i <= count; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                list[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (j == 1) {
                    list[i][j] = list[i - 1][j] + list[i][j];
                } else if (i == j) {
                    list[i][j] = list[i - 1][j - 1] + list[i][j];
                } else {
                    list[i][j] = Math.max(list[i - 1][j], list[i - 1][j - 1]) + list[i][j];
                }

                if (list[i][j] > sum) {
                    sum = list[i][j];
                }
            }
        }
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
