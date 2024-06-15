package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixExpressionConverter {

    private static int precedence(char ch) {
        switch (ch) {
            case '(' : return 0;
            case '+' : case '-' : return 1;
            case '*' : case '/' : return 2;
        }
        return -1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] expression = br.readLine().toCharArray();

        for (char ch : expression) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result);
    }
}