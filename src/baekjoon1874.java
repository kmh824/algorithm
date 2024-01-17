
/**
 * baekjoon1874
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int line = Integer.valueOf(br.readLine());
        int start = 0;

        while (line-- > 0) {
            int n = Integer.valueOf(br.readLine());

            if (n > start) {
                for (int i = start + 1; i <= n; i++) {
                    stack.push(i);
                    sb.append("+" + '\n');
                }

                start = n;
            }

            else if (n < start && n != stack.peek()){
                System.out.println("NO");
                return;
            }
            
            stack.pop();
            sb.append("-" + '\n');
        }

        System.out.println(sb);

    }
}