package Algorithm_inflearn.T.Stack_Queue05;

import java.util.Scanner;
import java.util.Stack;

/**
 * 4.후위식 연산(postfix)
 */

public class postfix004 {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)){
                stack.push(x - 48);
                //System.out.println(stack); // [3] [3, 5] [3, 5, 2] [3, 5, 2, 9]
            }else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+'){
                    stack.push(lt + rt);
                }else if (x == '-'){
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }

        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        postfix004 T = new postfix004();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
