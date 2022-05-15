package Algorithm_inflearn.Me.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

/**
 *  1.올바른 괄호
 */


public class correctParenthesis1{
    public String solution(String s) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO"; // 닫는 괄호 많을 경우
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) { //여는 괄호가 있을 경우
            return "NO";
        }

        return answer;
    }
    public static void main(String[] args) {
        correctParenthesis1 T = new correctParenthesis1();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}

