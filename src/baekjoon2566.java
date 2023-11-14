import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon2566 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        int n = 1;
        int mx = 0;
        int max = 0;
        int column = 0;
        int row = 0;
        int[] arr = new int[9];

        while (n <= 9) {
            String[] readLine = br.readLine().split(" ");

            for (int i = 0; i < 9; i++) {
                arr[i] = Integer.valueOf(readLine[i]);
            }
            mx = Arrays.stream(arr).max().getAsInt();
            if (max < mx) {
                max = mx;
                row = n;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == max) {
                        column = j + 1;
                        break;
                    }
                }
            }
            if(mx==0) {
                row = 1;
                column= 1;
            }
            n++;
        }

        str.append(max).append("\n");
        str.append(row).append(" ").append(column);
        
        System.out.print(str);
        br.close();
    }
}
