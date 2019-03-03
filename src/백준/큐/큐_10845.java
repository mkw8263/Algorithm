package 백준.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 큐_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        LinkedList<String> queue = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            operator(queue, stringTokenizer);
        }
    }

    private static void operator(LinkedList<String> queue, StringTokenizer stringTokenizer) {
        switch (stringTokenizer.nextToken()) {
            case "push":
                queue.add(stringTokenizer.nextToken());
                break;
            case "pop":
                if (queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.poll());
                break;
            case "size":
                System.out.println(queue.size());
                break;
            case "empty":
                if (queue.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
                break;
            case "front":
                if (queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.getFirst());
                break;
            case "back":
                if (queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.getLast());
                break;
        }
    }
}
