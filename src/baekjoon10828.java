/**
 * baekjoon10828
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon10828 {
    public static List<Integer> stack = new ArrayList<>();

    private static void push(int x){
        stack.add(x);
    }

    private static int pop() {
        if (stack.isEmpty()) {return -1;}
        else {
            int size = stack.size();
            return stack.remove(size-1);
        }
    }

    private static int size() {
        return stack.size();
    }

    private static int empty() {
        if (stack.isEmpty()) {return 1;}
        else {return 0;}
    }

    private static int top() {
        if (stack.isEmpty()) {return -1;}
        else {
            int size = stack.size();
            return stack.get(size-1);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int input = Integer.valueOf(br.readLine());
        int x = 0;
        while (input-- != 0) {
            String[] read = br.readLine().split(" ");
            if (read.length == 2) {
                x = Integer.valueOf(read[1]);
            }

            switch (read[0]) {
                case "push" -> push(x);
                case "pop" -> System.out.println(pop());
                case "size" -> System.out.println(size());
                case "empty" -> System.out.println(empty());
                case "top" -> System.out.println(top());
                                                          
            }
        }


    }
}