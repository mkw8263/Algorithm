package 프로그래머스.자료구조;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프린터 {
    public static void main(String[] args) {
    }

    public int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue priority = new PriorityQueue<>(Collections.reverseOrder());

        for (int task : priorities) {
            priority.add(task);
            System.out.println(priority);
        }

        System.out.println(priority);
        while (!priority.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == (int) priority.peek()) {
                    if (i == location) {
                        return answer;
                    }
                    priority.poll();
                    answer++;
                }
            }
        }

        return answer;
    }
}
