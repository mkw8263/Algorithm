package 백준.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위표기식_1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            operator(input.charAt(i), stack);
        }

        printPop(stack);
    }

    private static void printPop(Stack<Character> stack) {
        while (stack.size() > 0) {
            System.out.print(stack.pop());
        }
    }

    private static void operator(char ch, Stack<Character> stack) {
        switch (ch) {
            case '(':
                stack.push(ch);
                break;
            case ')':
                while (!stack.isEmpty() && stack.peek() != '(') {
                    System.out.print(stack.pop());
                }
                stack.pop();
                break;
            case '+':
            case '-':
            case '*':
            case '/':
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(ch)) {
                    System.out.print(stack.pop());
                }
                stack.push(ch);
                break;
            default:
                System.out.print(ch);
        }
    }

    private static int priority(char ch) {
        switch (ch) {
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            case '(':
            case ')':
                return 0;
        }
        return -1;
    }
}
