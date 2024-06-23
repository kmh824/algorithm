package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TextAnalyzer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] charCounts = new int[4];
        String readLine;
        while ((readLine = br.readLine()) != null) {
            for (int i = 0; i < readLine.length(); i++) {
                char c = readLine.charAt(i);
                if (Character.isLowerCase(c)) {
                    charCounts[0]++;
                }
                if (Character.isUpperCase(c)) {
                    charCounts[1]++;
                }
                if (Character.isDigit(c)) {
                    charCounts[2]++;
                }
                if (Character.isSpaceChar(c)) {
                    charCounts[3]++;
                }
            }
            for (int charCount : charCounts) {
                sb.append(charCount).append(" ");
            }
            sb.append('\n');
            Arrays.fill(charCounts,0);
        }
        System.out.println(sb);
    }
}
