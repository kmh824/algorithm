import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class baekjoon2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int numberOfPaper = Integer.valueOf(br.readLine());
        int totalArea = numberOfPaper * 100;
        int [][] coordinates = new int[numberOfPaper][2];

        for (int i = 0; i < numberOfPaper; i ++) {
            String[] cd  = br.readLine().split(" ");
            coordinates[i][0] = Integer.valueOf(cd[0]);
            coordinates[i][1] = Integer.valueOf(cd[1]);
        }

        for (int j = 0; j < numberOfPaper - 1; j ++) {
            // 사각형 좌표 coordinates를 하나씩 바교하면서 ]
            // 각각의 좌표가 10차이 이하로 나면 compareNumbers함수 실행
            // 전체 면적 totalArea에서 뺴기
        }
        

    }

    private int compareNumbers(int x1, int y1, int x2, int y2){
        int x, y;
        x = Math.abs(x1 - x2 + 10);
        y = Math.abs(y1 - y2 + 10);

        return x*y;
    }
}
