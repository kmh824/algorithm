package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


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

// LinkedList / ListIterator 사용
public class Editor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> list = new LinkedList<>();

        for (char c : br.readLine().toCharArray()) {
            list.add(c);
        }
        ListIterator<Character> iterator = list.listIterator(list.size());

        int n = Integer.parseInt(br.readLine());

        while(n -- != 0){
            StringTokenizer token = new StringTokenizer(br.readLine());

            switch(token.nextToken()){
                case "L" : if(iterator.hasPrevious()){iterator.previous();} break;
                case "D" : if(iterator.hasNext()){iterator.next();} break;
                case "B" :
                    if(iterator.hasPrevious()){
                        iterator.previous();
                        iterator.remove();
                    } break;
                case "P" :
                    if(token.hasMoreTokens()){
                        iterator.add(token.nextToken().charAt(0));
                    }
                    break;
            }
        }
        String result = list.stream()
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(result);
    }
}