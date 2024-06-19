package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//알파벳 수
public class AlphabetCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int[] counts = new int[26];
        Arrays.fill(counts,0);

        for (int i = 0; i < str.length(); i++) {
            counts[str.charAt(i) - 97] += 1;
        }
        for (int count : counts) {
            sb.append(count).append(" ");
        }
        System.out.println(sb);
    }
}
