package Me.StackQueue;
/**
 * 4.후위식 연산(postfix)
 *
 */

import java.util.Scanner;
import java.util.Stack;

public class postfix4 {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            //System.out.println("x = " + x);  // 출력 : 352+*9-
            if (Character.isDigit(x)) {
                stack.push(x-48);  // 0 ~ 9 - 아스키넘버 : 48  ~ 57  -> 아스키코드 - 정수 = 정수
                //System.out.println("x = " + x); // 출력 : 3 5 2 9
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }

            }
        }
        answer = stack.get(0); // get(0) : 0은 스택공간에서 0번째를 불러오는것이다.
        return answer;
    }

    public static void main(String[] args) {
        postfix4 T = new postfix4();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
