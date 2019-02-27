package 백준_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위표기식_1935 {

    public static void main(String[] args) throws IOException {
        System.out.format("%.2f", result());
    }

    private static Double result() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        char[] charArr = br.readLine().toCharArray();
        double[] doubleArr = new double[input];
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < input; i++) {
            doubleArr[i] = Double.parseDouble(br.readLine());
        }

        for (char ch : charArr) {
            switch (ch) {
                case '+':
                case '-':
                case '*':
                case '/':
                    operation(stack, stack.pop(), stack.pop(), ch);
                    break;
                default:
                    stack.push(doubleArr[ch - 'A']);
                    break;
            }
        }
        return stack.peek();
    }

    private static void operation(Stack<Double> stack, double first, double second, char ch) {
        switch (ch) {
            case '+':
                stack.push(second + first);
                break;
            case '-':
                stack.push(second - first);
                break;
            case '*':
                stack.push(second * first);
                break;
            case '/':
                stack.push(second / first);
                break;
        }
    }
}
