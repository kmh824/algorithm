/**
* baekjoon9012 괄호
*/

/* 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (line -- != 0)
        {
            int countL = 0;
            int countR = 0;
            boolean bool = true;
            String input = br.readLine();
            
            if(input.length() % 2 != 0){
                sb.append("NO" + '\n');
            }
            else {
                char[] c = input.toCharArray();
                for (int i = 0; i < c.length; i++){
                    if(c[i] == '('){
                        countL ++;
                    }
                    else if(c[i] == ')')
                    {
                        countR ++;
                    }

                    if(countL < countR){
                        bool = false;
                    }
                    
                }

                if(input.length() / 2 == countL && bool ){
                    sb.append("YES" + '\n');
                }
                else {
                    sb.append("NO" + '\n');
                }
            }
            
        }
        System.out.println(sb.toString());
    }
}
*/

//stack 이용
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon9012 {

    public static String validate(char[] input) {
        Stack<Character> stack = new Stack<>();
        

        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(') {
                stack.push('(');
            } else if (input[i] == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()) {return "YES";}
        else{return "NO";}
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int line = Integer.valueOf(br.readLine());

        while (line-- != 0) {
            char[] input = br.readLine().toCharArray();
            sb.append(validate(input) + '\n');
        }
        System.out.println(sb.toString());
    }
}