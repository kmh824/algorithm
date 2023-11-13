import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon25206 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        baekjoon25206 bj = new baekjoon25206();
        bj.solution();
    }

    private void solution() throws Exception {
        int i = 20;
        double gradeSum = 0;
        double sum = 0;

        while (i-- > 0) {
            String inputLine = br.readLine(); // 한 줄을 읽어옴
            String str[] = inputLine.split(" ");

            double grade = Double.parseDouble(str[1]);
            Double credit = getCredit(str[2]);

            if (credit == null)
                continue;

            gradeSum += grade * credit;
            sum += grade;
        }
        System.out.printf("%.6f", gradeSum / sum);

    }

    // switch에서 null값을 리턴해야 하는 경우 double의 wrapper클래스인 Double형으로 반환값을 설정함.
    private Double getCredit(String s) {
        switch (s) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
        }
        return null;
    }
}

