package BaekJoon.Queue;

/*
    10845. 큐

    -문제
    정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
    명령은 총 여섯 가지이다.

    push X: 정수 X를 큐에 넣는 연산이다.
    pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    size: 큐에 들어있는 정수의 개수를 출력한다.
    empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
    front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.


    -입력
    첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
    주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

    -출력
    출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

-예제 입력
15
push 1
push 2
front
back
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
front

-예제 출력
1
2
2
0
1
2
-1
0
1
-1
0
3



 */

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.Scanner;


public class 큐{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 명령 횟수
        int[] Q = new int[n]; // n크기만한  Queue 공간
        int begin = 0;
        int end = 0;

        while(n-- > 0){  // n이 0보다 작거나 같으면 거짓..될때까지 돌리기
            String cmd = in.next(); // cmd는 명령
            if(cmd.equals("push")) {  // push가 들어올 경우
                int num = Integer.parseInt(in.next()); // push x <- x부분 : 1
                Q[end++] = num; // Q[0] = 1,  Q[end++] -> Q[1]
            }else if(cmd.equals("front")){ // front가 들어올 경우
                if (begin == end) { // 0 == 1 -> 거짓
                    System.out.println("-1");
                } else{
                    System.out.println(Q[begin]); // Q[begin] -> Q[0] = 1
                }
            } else if (cmd.equals("size")) { // size가 나올 경우
                System.out.println(end - begin); // 1 - 0 = 1
            } else if (cmd.equals("empty")) { // empty가 나올떄
                if(begin == end){ // 0 == 1 -> 거짓 else로
                    System.out.println("1"); // 큐가 비어있을 떄
                }else{  // 큐 안에 데이터가 있다.
                    System.out.println("0");
                }
            } else if (cmd.equals("pop")) { // pop이 나올 경우
                if (begin == end) { // 0 == 1 -> 거짓 else로
                    System.out.println("-1"); // 큐에 정수가 없다.
                }else{ // 큐에 정수가 있을 때
                    System.out.println(Q[begin]); // 가장 앞에 있는 수 : 0
                    begin += 1; // begin = 1
                }
            } else if (cmd.equals("back")) { // back이 나올 경우
                if (begin == end) { // 1 == 1
                    System.out.println("-1"); // 큐가 정수에 없는 경우
                }else {
                    System.out.println(Q[end - 1]); //Q[1-1] -> Q[0] = 1
                }
            }
        }
    }
}
