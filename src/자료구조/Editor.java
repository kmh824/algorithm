package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


// StringBuilder 사용
/*
public class Editor {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb.append(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int cursor = sb.length();

        while(n-- != 0) {
            String str = br.readLine();

            switch (str.charAt(0)) {
                case 'L' :
                    if(cursor > 0){cursor --;} break;
                case 'D' :
                    if(cursor < sb.length()) {cursor ++;} break;
                case 'B' :
                    if(cursor > 0) {sb.deleteCharAt(cursor -1); cursor --;}  break;
                case 'P' :

                    sb.insert(cursor,str.charAt(2)); cursor ++; break;
            }

        }
        System.out.println(sb);

    }

}
*/

public class Editor {
    private static List<String> list = new LinkedList<>();

    public Editor() {
    }

    private void L(int cursor) {
        if (cursor > 0){cursor --;}
    }

    private void D(int cursor, List<String> list) {
        if(cursor < list.size()) {cursor ++;}
    }

    private void B(int cursor) {

    }
    private void P(int cursor) {

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer token = new StringTokenizer(str);
        ListIterator<String> iterator = list.listIterator();


        Editor editor = new Editor();
        list.add(str);
        System.out.println(list);
        editor.L(0);
        editor.D(0,list);


    }
}