package BaekJoon.Stack19;
/*
    10828. 스택

    -문제
    정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.명령은 총 다섯 가지이다.
    push X: 정수 X를 스택에 넣는 연산이다.
    pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    size: 스택에 들어있는 정수의 개수를 출력한다.
    empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    top: 스택의 가장 위에 있는 정수를 출력한다.
    만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.


    입력)
    첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
     주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

     출력)
    출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

    입력 예제)
    14
    push 1
    push 2
    top
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
    top

    출력 예제)
    2
    2
    0
    2
    1
    -1
    0
    1
    -1
    0
    3

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class 스택 {
    static int[] stack; // 스택 자료구조
    static int size =0; // 사이즈는 안에있는 데이터를 나타냄  -> cf 배열의 길이랑 착각 ㄴㄴ

    public static void push(int data) {
        stack[size] = data; // 들어온 데이터를 넣어주고
        size++; // 스택의 사이즈도 1개로 올려준다.
    }

    public static int pop() {
        if(size == 0) return -1; // 한개도 없을 때 -1 반환
        else{ //최상단의 데이터를 빼낸다.
            int res = stack[size - 1]; // 인덱스는 0부터 시작이라서 최상단에있는 요소는 size -1 index에 위치한다
            stack[size - 1] = 0; // 0으로 초기화
            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) return 1;
        else return 0;
    }

    public static int top() {
        if(size == 0) return -1;
        else return stack[size - 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        int n = in.nextInt();

        stack = new int[n];
        for (int i = 0; i < n; i++) {
            String str = in.next();

            switch (str) {
                case "push":
                    push(in.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');

                case "empty":
                    sb.append(empty()).append('\n');

                case "top":
                    sb.append(top()).append('\n');
            }

        }
        System.out.println(sb);
    }
}
