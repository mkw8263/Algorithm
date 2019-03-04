package 백준.덱;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 덱_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            operator(deque, stringTokenizer, bw);
        }
        bw.close();
    }

    private static void operator(Deque<Integer> deque, StringTokenizer stringTokenizer, BufferedWriter bw) throws IOException {
        switch (stringTokenizer.nextToken()) {
            case "push_back":
                deque.addLast(Integer.parseInt(stringTokenizer.nextToken()));
                break;
            case "push_front":
                deque.addFirst(Integer.parseInt(stringTokenizer.nextToken()));
                break;
            case "front":
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(deque.getFirst()) + "\n");
                }
                break;
            case "back":
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(deque.getLast()) + "\n");
                }
                break;
            case "size":
                bw.write(String.valueOf(deque.size()) + "\n");
                break;
            case "empty":
                if (deque.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
                break;
            case "pop_front":
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(deque.pollFirst()) + "\n");
                }
                break;
            case "pop_back":
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(deque.pollLast()) + "\n");
                }
                break;
        }
    }
}
