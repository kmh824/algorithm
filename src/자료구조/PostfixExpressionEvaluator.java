package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Stack;

/**
 * 후위표기식2
 */
public class PostfixExpressionEvaluator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lines = Integer.parseInt(br.readLine());
        String expression = br.readLine();

        Double result = 0d;
        int[] arr = new int[lines];
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < lines; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < expression.length(); i ++) {
            char c = expression.charAt(i);
            switch (c) {
                case '+' :
                    stack.push(stack.pop() + stack.pop());
                    break;
                case '-' :
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a - b);
                    break;
                case '*' :
                    stack.push(stack.pop() * stack.pop());
                    break;
                case '/' :
                    double divisor = stack.pop();
                    double dividend = stack.pop();
                    stack.push(dividend / divisor);
                    break;
            }
            if (c >= 65 && c<= 90) {
                stack.push((double)arr[c - 65]);
            }
        }
        result = stack.pop();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(result));

    }
}
