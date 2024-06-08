package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IronRodCutter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append(br.readLine());

        int result = 0;

        int currentBarLasers = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(' && sb.charAt(i + 1) == ')') {
                sb.replace(i, i + 2, "0");
            }
        }
        int first = sb.indexOf("(");
        sb.delete(0, first);
        int i = -1;

        while (sb.toString().contains("(")) {
            if (sb.length() - 1 <= i) i = -1;
            i++;
            if (sb.charAt(i) == '(' && sb.charAt(i + 1) == '0') {
                sb.deleteCharAt(i);
                while (sb.charAt(i) != ')') {
                    if (sb.charAt(i) == '0') {
                        currentBarLasers++;
                    }
                    i++;
                }
                result = result + currentBarLasers + 1;
                currentBarLasers = 0;
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(result);
    }
}
