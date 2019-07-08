package 백준.DFS;

import java.io.*;
import java.util.StringTokenizer;

public class 바이러스 {
    static int count = 0;
    static int n = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());


        int[][] map = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            StringTokenizer stringTokenizer1 = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(stringTokenizer1.nextToken());
            int second = Integer.parseInt(stringTokenizer1.nextToken());

            map[first][second] = map[second][first] = 1;
        }
        int[] visited = new int[n + 1];
        dfs(1, map, visited);
        bw.write(String.valueOf(count));
        bw.close();
    }

    private static void dfs(int start, int[][] map, int[] visited) {
        visited[start] = 1;
        for (int i = 1; i < n + 1; i++) {
            if (map[start][i] == 1 && visited[i] == 0) {
                count++;
                dfs(i, map, visited);
            }
        }

    }

}
