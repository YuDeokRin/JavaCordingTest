package Programmers.level_0;

import java.util.Stack;

public class 컨트롤제트 {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;

    }

    public static void main(String[] args) {
        컨트롤제트 T = new 컨트롤제트();
        System.out.println(T.solution(new String("1 2 Z 3")));
    }
}
