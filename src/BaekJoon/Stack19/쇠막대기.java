package BaekJoon.Stack19;

import java.util.Scanner;
import java.util.Stack;
/*
    10799번 쇠막대기

    -문제
    https://www.acmicpc.net/problem/10799

    -입력
    한 줄에 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 공백없이 주어진다. 괄호 문자의 개수는 최대 100,000이다.

    -출력
    잘려진 조각의 총 개수를 나타내는 정수를 한 줄에 출력한다.

    -예제 입력
    ()(((()())(())()))(())

    -예제 출력
    17


    -예제 입력
    (((()(()()))(())()))(()())

    -예제 출력
    24


 */

public class 쇠막대기{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim(); // trim() : 왼쪽, 오른쪽 공백을 제거해준다. ex) "  앞에 공백 2, 뒤에 공백 3   " trim()사용하면 -> "앞에 공백 2, 뒤에 공백 3"
        int n = s.length(); // a
        Stack<Integer> stack = new Stack<Integer>();
        int ans = 0;
        for (int i=0; i<n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                if (stack.peek()+1 == i) {
                    stack.pop();
                    ans += stack.size();
                } else {
                    stack.pop();
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}