package 백준.큐;

import java.io.*;
import java.util.LinkedList;

public class 조세퍼스_문제0_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            linkedList.add(i);
        }
        bw.write("<");
        while (!linkedList.isEmpty()) {
            for (int i = 0; i < M - 1; i++) {
                int num = linkedList.poll();
                linkedList.addLast(num);
            }
            bw.write(String.valueOf(linkedList.poll()));
            if (linkedList.size() != 0) {
                bw.write(", ");
            }
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}
