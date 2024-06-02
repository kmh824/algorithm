package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseTheWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int line = Integer.parseInt(br.readLine());

        while(line -- != 0) {
            String[] str = br.readLine().split(" ");
            for (String s : str) {
                sb.append(s);
                System.out.print(sb.reverse().toString());
                System.out.print(" ");
                sb.setLength(0);
            }
            System.out.println();
        }

    }
}
