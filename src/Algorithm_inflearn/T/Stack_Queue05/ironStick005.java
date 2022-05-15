package Algorithm_inflearn.T.Stack_Queue05;

import java.util.Scanner;
import java.util.Stack;

public class ironStick005 {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        // for (char x : str.toCharArray()) {} 이렇게 안쓰는 이유는 x가 닫는괄호(')') 일 때 바로 앞을 확인하기가 어렵다. (코드 복잡해진다.)
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            else{
                stack.pop(); // '('여는괄호를 빼준다.

                //레이저지점
                if (str.charAt(i-1)== '(') answer+= stack.size(); // 스택에 있는 막대기 갯수 구하기
                else  answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ironStick005 T = new ironStick005();
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        System.out.println(T.solution(str));
    }
}
