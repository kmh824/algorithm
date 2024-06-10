package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


/**
 * 오큰수
 */
public class NextGreaterElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];
        int[] sequence = new int[N];
        Stack<Integer> stack = new Stack<>();

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(input[i]);
        }

        for (int i = N - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= sequence[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            }
            else if (stack.peek() > sequence[i]) {
                result[i] = stack.peek();
            }
            stack.push(sequence[i]);
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
