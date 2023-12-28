import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] InputLine = br.readLine().split(" ");
        
        String Num = InputLine[0];
        int digit = Integer.valueOf(InputLine[1]);

        int result = 0;
        int n = 1;
        

        for (int i = Num.length() - 1; i >= 0; i--) {
            char c = Num.charAt(i);
            if ('A' <= c && c <= 'Z') {
                result += (c - 55) * n;
            } 
            else {
                result += (c - '0') * n; //c가 0~9인 경우. c는 char이기 떄문에 아스키코드값 문자 '0'을 빼줘야함.
            }
            n *= digit;
        }
        System.out.println(result);
        br.close();    
    }
}