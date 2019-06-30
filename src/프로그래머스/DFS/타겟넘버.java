package 프로그래머스.DFS;

public class 타겟넘버 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 1, 1};
        System.out.println(BFS1(a, 3, 0, 0));
    }

    private static int BFS1(int[] arr, int target, int index, int result) {
        if (arr.length == index) return target == result ? 1 : 0;
        return BFS1(arr, target, index + 1, result + arr[index]) + BFS1(arr, target, index + 1, result - arr[index]);
    }
}
