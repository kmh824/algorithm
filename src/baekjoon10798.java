import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baekjoon10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        int textLine = 4;

        String line = br.readLine();
        String inputLine[] = line.split("");

        // 처음 읽은 라인을 list에 집어넣음.
        for (int i = 0; i < inputLine.length; i++) {
            list.add(inputLine[i]);
        }
        
        while (textLine-- > 0) {
            line = br.readLine();
            if (line == null) {
                continue;
            }

            String arr[] = line.split("");

            // 다음 라인의 길이가 기존 라인이 길이보다 짧거나 같은경우
            if (list.size() >= arr.length) {
                for (int j = 0; j < arr.length; j++) {
                    list.set(j, list.get(j) + arr[j]);
                }
            }

            // 다음 라인의 길이가 기존 라인의 길이보다 긴경우
            else if (list.size() < arr.length) {
                for (int j = 0; j < list.size(); j++) {
                    list.set(j, list.get(j) + arr[j]);
                }

                for (int j = list.size(); j < arr.length; j++) {
                    list.add(arr[j]);
                }
            }
        }

        for (String s : list) {
            System.out.print(s);
        }
    }
}
