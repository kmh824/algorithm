package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String readLine = br.readLine();

        for (int i=0; i < readLine.length(); i++) {
            char c = readLine.charAt(i);
            char lineChar;
            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    if (c + 13 <= 90) {
                        sb.append((char)(c + 13));
                    }
                    else  {
                        sb.append((char)((c + 13) - 26));
                    }
                }
                else {
                    if (c + 13 <= 122) {
                        sb.append((char)(c + 13));
                    }
                    else {
                        sb.append((char)((c + 13) - 26));
                    }
                }
            }
            else {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
