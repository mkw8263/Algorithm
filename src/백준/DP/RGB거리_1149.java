package 백준.DP;

import java.io.*;
import java.util.StringTokenizer;

public class RGB거리_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[][] inputArr = new int[count][3];
        int[][] rgbArr = new int[count][3];

        StringTokenizer stringTokenizer;
        for (int i = 0; i < count; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                inputArr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        rgbArr[0][0] = inputArr[0][0];
        rgbArr[0][1] = inputArr[0][1];
        rgbArr[0][2] = inputArr[0][2];

        for (int i = 1; i < count; i++) {
            rgbArr[i][0] = Math.min(rgbArr[i - 1][1], rgbArr[i - 1][2]) + inputArr[i][0];
            rgbArr[i][1] = Math.min(rgbArr[i - 1][0], rgbArr[i - 1][2]) + inputArr[i][1];
            rgbArr[i][2] = Math.min(rgbArr[i - 1][0], rgbArr[i - 1][1]) + inputArr[i][2];
        }
        bw.write(String.valueOf(Math.min(Math.min(rgbArr[count - 1][0], rgbArr[count - 1][1]), rgbArr[count - 1][2])));
        bw.close();
    }
}
