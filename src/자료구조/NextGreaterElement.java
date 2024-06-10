package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


/**
 * 오큰수
 * stack에 배열의 index를 저장
 */
public class NextGreaterElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int[] sequence = new int[N];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && sequence[stack.peek()] < sequence[i]) {
                sequence[stack.pop()] = sequence[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            sequence[stack.pop()] = -1;
        }
        for (int i : sequence) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);

    }
}
