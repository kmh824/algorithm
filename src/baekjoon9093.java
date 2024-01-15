/**
 * baekjoon9093
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon9093 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
    
        int line = Integer.valueOf(br.readLine());

        while (line-- != 0){
            String result = "";
            String[] input = br.readLine().split(" ");

            for (int i = 0; i < input.length; i++){
                sb.append(input[i]).reverse();
                result += sb.toString() + " ";

                sb.setLength(0);
            }
            
            System.out.println(result);
        }

    }
}