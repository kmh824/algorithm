import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = br.readLine().split(" ");

        int A = Integer.valueOf(inputLine[0]);
        int B = Integer.valueOf(inputLine[1]);
        int V = Integer.valueOf(inputLine[2]);

        if (V == A) {
            System.out.println("1");
        } 
        else if ((V - A) % (A - B) > 0) {

            System.out.println(((V - A) / (A - B)) + 2);
        }
        else if ((V - A) % (A - B) == 0) {
            if (((V - A) / (A - B)) == 0) {
                System.out.println(((V - A) / (A - B)) + 2);
            } else
                System.out.println(((V - A) / (A - B)) + 1);
        }
    }
}
