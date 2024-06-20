package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AlphabetFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();

        String str = br.readLine();
        int[] result = new int[26];
        Arrays.fill(result,-1);

        for (int i = 0; i < str.length(); i++) {
            if (result[str.charAt(i) - 97] == -1){
                result[str.charAt(i) - 97] = i;
            }
        }

        for (int i : result) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
