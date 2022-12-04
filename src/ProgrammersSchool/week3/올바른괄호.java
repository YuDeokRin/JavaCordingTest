package ProgrammersSchool.week3;

import java.util.Stack;

/*
    해법
    1. 열리는 괄호를 배치한다.
    2. 그 이후에 닫히는 괄호를 배치한다.
    3. 괄호는 N개 이상 사용할 수 없다.
    4. 열리기 전에는 닫히는 괄호를 사용할 수 없다.


    깊이 우선 탐색  -> 스택
 */
public class 올바른괄호 {


    static class Solution {

        class P {
            int open, close;

            P(int open, int close) {
                this.open = open;
                this.close = close;
            }
        }

        public int solution(int n) {
            int answer = 0;

            Stack<P> stack = new Stack<>();
            stack.push(new P(0, 0));
            while (!stack.isEmpty()) {
                P p = stack.pop();

                if (p.open > n) continue;
                if (p.open < p.close) continue;
                if (p.open + p.close == 2 * n) {
                    answer++;
                    continue;
                }
                stack.push(new P(p.open + 1, p.close));
                stack.push(new P(p.open, p.close + 1));
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(3));
    }
}
