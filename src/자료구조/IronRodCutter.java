package 자료구조;

import java.io.*;
import java.util.Stack;

//()(((()())(())()))(())
/*
1. 문장을 차례로 읽으면서 레이저가 현재 자를 수 있는 막대기 수를 파악.
2. 막대기의 끝을 파악하면 result +1 (막대기를 모두 자르고 나면 레이저의 수보다 1조각 더 나오기 때문)
 */
public class IronRodCutter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack stack = new Stack();

        String input = br.readLine();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            }
            if (input.charAt(i) == ')') {
                if (input.charAt(i - 1) == '(') {
                    stack.pop();
                    result += stack.size();
                }
                else if (input.charAt(i - 1) != '(') {
                    result += 1;
                    stack.pop();
                }
            }
        }
        bw.write(result + "\n");
        bw.flush();
    }
}
