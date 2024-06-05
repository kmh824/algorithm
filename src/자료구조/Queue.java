package 자료구조;



/*push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<String> queue = new ArrayDeque<>();

        while (n-- > 0) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push":
                    queue.addLast(command[1]);
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        System.out.println(queue.pollFirst());
                    }
                    else {
                        System.out.println("-1");
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        System.out.println(queue.peekFirst());
                    }
                    else {
                        System.out.println("-1");
                    }
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        System.out.println(queue.peekLast());
                    }
                    else {
                        System.out.println("-1");
                    }
                    break;
            }
        }

    }
}
