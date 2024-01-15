import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int sum, min = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int n = num1; n <= num2; n++) {
            boolean soul = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    soul = false;
                    break;
                }
            }
            if (soul) {
                list.add(n);
            }
        }

        if (list.isEmpty()) {
            System.out.println(-1);
        } 
        else {
            sum = list.stream().mapToInt(Integer::intValue).sum();
            
            if (list.get(0) == 1) {
                min = list.get(1);
                sum -= 1;
            }
            else{min = list.get(0);}

            

            System.out.println(sum + "\n" + min);
        }
    }
}
