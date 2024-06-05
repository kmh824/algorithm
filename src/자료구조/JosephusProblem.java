package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class JosephusProblem {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] command = br.readLine().split(" ");
        int N = Integer.parseInt(command[0]);
        int K = Integer.parseInt(command[1]);

        LinkedList<Integer> list = new LinkedList<>();
        for(int i =1; i<=N; i++) {
            list.add(i);
        }

        sb.append("<");
        while(N-- != 1) {
           for (int i = 0; i < K-1; i++) {
               int result = list.pollFirst();
               list.add(result);
           }
           sb.append(list.pollFirst() + ", ");
        }
        sb.append(list.pollFirst());
        sb.append(">");
        System.out.println(sb);
    }
}
