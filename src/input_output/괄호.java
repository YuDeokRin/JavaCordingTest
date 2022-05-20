package input_output;

import java.util.Scanner;
import java.util.Stack;

/**
 * 9012. 괄호
 */
public class 괄호 {
    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        String answer = "YES";
        for (Character x : s.toCharArray()) {
            if (x == '(') stack.push(x);
            else if (stack.isEmpty()){
                return "NO";

            }else {
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        else return answer;
    }

    public static void main(String[] args) {
        괄호 T = new 괄호();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            System.out.println(T.solution(s));
        }
    }
}
