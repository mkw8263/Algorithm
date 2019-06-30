package 프로그래머스.자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 프린터 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

//    public static int solution(int[] priorities, int location) {
//        int answer = 0;
//        int l = location;
//
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i : priorities) {
//            ((LinkedList<Integer>) queue).add(i);
//        }
//        Arrays.sort(priorities);
//        int size = queue.size() - 1;
//
//        while (!queue.isEmpty()) {
//            int temp = queue.poll();
//            if (temp == priorities[size - answer]) {
//                answer++;
//                l--;
//                if (l < 0) break;
//            } else {
//                ((LinkedList<Integer>) queue).add(temp);
//                l--;
//                if (l < 0) {
//                    l = queue.size() - 1;
//                }
//            }
//        }
//        return answer;
//    }

//    public int solution(int[] priorities, int location) {
//        int answer = 0;
//        int l = location;
//
//        Queue<Integer> que = new LinkedList<Integer>();
//        for(int i : priorities){
//            que.add(i);
//        }
//
//        Arrays.sort(priorities);
//        int size = priorities.length-1;
//
//
//
//        while(!que.isEmpty()){
//            Integer i = que.poll();
//            if(i == priorities[size - answer]){
//                answer++;
//                l--;
//                if(l <0)
//                    break;
//            }else{
//                que.add(i);
//                l--;
//                if(l<0)
//                    l=que.size()-1;
//            }
//        }
//
//        return answer;
//    }
}
