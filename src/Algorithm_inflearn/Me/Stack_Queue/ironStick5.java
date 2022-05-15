package Algorithm_inflearn.Me.Stack_Queue;
/**
 * 5. 쇠막대기
 *
 * 입력 : ()(((()())(())()))(())
 * 공략
 * ① '(' 만날 때  push('(')
 * ② ')' 만날 때 두 가지 경우
 *      첫 번째 레이저 발사할 때 - 바로 앞의 것이 '(' 일 경우
 *      두 번째 막대기 끝을 알릴 때 - )) 일 경우
 */

import java.util.Scanner;
import java.util.Stack;

public class ironStick5  {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push('(');
            else{
                stack.pop();
                if (s.charAt(i-1) == '(') answer+= stack.size();
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ironStick5 T = new ironStick5();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}

