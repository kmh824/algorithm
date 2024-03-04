/* 에디터 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon1406 {
    public static StringBuilder sb = new StringBuilder();

    private static int funcL(int cursor) {
        if (cursor > 0){
            return -- cursor;
        }
        else return cursor;
    }
    private static int funcD(int cursor) {
        if (cursor <sb.length()) {
            return ++ cursor;
        }
        else return sb.length();
    }
    private static int funcB(int cursor) {
        if (cursor != 0) {
            sb.deleteCharAt(cursor -1);
            return -- cursor;
        }
        else return cursor;
    }
    private static int funcP(int cursor, String c) {
        if (cursor == sb.length()){
            sb.append(c);
            return ++ cursor;
        }
        else {
            sb.insert(cursor, c);
            return ++ cursor;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int cursor = str.length();
        int lineNum = Integer.valueOf(br.readLine());
        sb.append(str);

        while (lineNum -- != 0){
            String []input = br.readLine().split(" ");

            switch (input[0]) {
                case "L":
                    cursor = funcL(cursor);
                    break;
                case "D":
                    cursor = funcD(cursor);
                    break;
                case "B":
                    cursor = funcB(cursor);
                    break; 
                case "P":
                    cursor = funcP(cursor, input[1]);
                    break;
            
                default:
                    break;
            }
            /*
            cursor = switch (input[0]) {
                case "L" -> funcL(cursor);
                case "D" -> funcD(cursor);
                case "B" -> funcB(cursor);
                case "P" -> funcP(cursor, input[1]);
                default -> 0;
            };
            */
        }
        System.out.println(sb.toString());


    }
}
