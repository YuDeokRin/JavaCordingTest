package T.StackQueue05;
/**
 * 2.괄호 문자 제거
 */

import java.util.Scanner;
import java.util.Stack;

public class removeParenthesisCharacters002 {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop()!= '(') ;
                }
            else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++)
            answer += stack.get(i);
            return answer;
    }

    public static void main(String[] args) {
        removeParenthesisCharacters002 T = new removeParenthesisCharacters002();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
