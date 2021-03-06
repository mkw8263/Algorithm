package 백준.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.StringTokenizer;

class Node {
    int index;
    int priority;

    Node(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

public class 프린터큐_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer;

        for (int i = 0; i < count; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int m = Integer.parseInt(stringTokenizer.nextToken());
            operator(n, m, br);
        }
    }

    private static void operator(int n, int m, BufferedReader br) throws IOException {
        StringTokenizer priorityTokenizer = new StringTokenizer(br.readLine());
        LinkedList<Node> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(new Node(i, Integer.parseInt(priorityTokenizer.nextToken())));
        }
        int count = 0;
        while (!queue.isEmpty()) {
            Node node = queue.poll();

            boolean check = true;
            for (Node i : queue) {
                if (Objects.requireNonNull(node).priority < i.priority) {
                    check = false;
                }
            }

            if (check) {
                count++;
                if (Objects.requireNonNull(node).index == m) {
                    break;
                }
            } else {
                queue.addLast(node);
            }
        }

        System.out.println(count);
    }
}
