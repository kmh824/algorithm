package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterFrequency {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<>();

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(str[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < size; i++) {
            while (!stack.empty() && map.getOrDefault(arr[stack.peek()],0) < map.getOrDefault(arr[i],0)) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            arr[stack.pop()] = -1;
        }
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);

    }
}
