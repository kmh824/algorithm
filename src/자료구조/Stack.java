package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int readLine = Integer.parseInt(br.readLine());


        while (readLine != 0) {
            String command = br.readLine();

            if (command.contains(" ")) {
                String[] commands = command.split(" ");
                deque.push(Integer.valueOf(commands[1]));
            }

            else {
                if (command.equals("pop")) {
                    if (deque.isEmpty()){
                        System.out.println("-1");
                    }
                    else
                    {
                        System.out.println(deque.pop());
                    }
                }

                if (command.equals("size")) {
                    System.out.println(deque.size());
                }
                if (command.equals("empty")) {
                    if (!deque.isEmpty()) {
                        System.out.println("0");
                    }
                    else {
                        System.out.println("1");
                    }
                }
                if (command.equals("top")) {
                    if (deque.isEmpty()) {
                        System.out.println("-1");
                    }
                    else {
                        System.out.println(deque.peek());
                    }

                }
            }
            readLine--;
        }

    }


}
