import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/* 수정 전
public class baekjoon2738 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m = 0;
        String str = "";
        String inputLine = br.readLine();
        String matrixSize[] = inputLine.split(" ");

        n = Integer.valueOf(matrixSize[0]);
        m = Integer.valueOf(matrixSize[1]);

        int firstMatrix[][] = new int[n][m];

        for (int i = 0; i < n * 2; i++) {

            String line = br.readLine();
            String matrix[] = line.split(" ");

            for (int j = 0; j < m; j++) {
                if (i < n) {
                    firstMatrix[i][j] = Integer.valueOf(matrix[j]);
                } else {
                    firstMatrix[i - n][j] += Integer.valueOf(matrix[j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                str += Integer.toString(firstMatrix[i][j]) + " ";
            }
            System.out.print(str);
            System.out.println();
            str = "";
        }
        br.close();
    }
}
*/

// 수정 후
public class baekjoon2738 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m = 0;
        String inputLine = br.readLine();
        String matrixSize[] = inputLine.split(" ");
        StringBuilder sb = new StringBuilder();

        n = Integer.valueOf(matrixSize[0]);
        m = Integer.valueOf(matrixSize[1]);

        int firstMatrix[][] = new int[n][m];

        for (int i = 0; i < n * 2; i++) {

            String line = br.readLine();
            String matrix[] = line.split(" ");

            for (int j = 0; j < m; j++) {
                if (i < n) {
                    firstMatrix[i][j] = Integer.valueOf(matrix[j]);
                } else {
                    sb.append(firstMatrix[i - n][j] + Integer.valueOf(matrix[j])).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
