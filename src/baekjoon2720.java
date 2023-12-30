import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon2720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<Integer> list = Arrays.asList(25,10,5,1);
        int num = 0;
        num = Integer.valueOf(br.readLine());
                
        while (num != 0){
            int cost = Integer.valueOf(br.readLine());
            
            for(int i = 0; i < list.size(); i++){
                sb.append(cost / list.get(i) + " ");
                cost %= list.get(i);
            }
            sb.append("\n");
            num--;
        }

        System.out.println(sb);
    }
}
