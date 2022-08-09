package Algorithm_inflearn.T.Stack_Queue05;
/*
    1. 올바른 괄호

    괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
    (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

    입력 예제)
    (()(()))(()

    출력 예졔)
    No
 */
import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호001 {
    public static void main(String[] args) {
        올바른괄호001 T = new 올바른괄호001();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "YES"; // default는 YES로
        Stack<Character> stack = new Stack<>(); // 스택객체 생성, 타입 : Character -> '(' ')' 라는 문자를 넣기 때문에
        for (Character ch: str.toCharArray()) { // str = "()()()()))" 대충 이렇게 된 문자가 오면
            if(ch == '(') stack.push(ch); // push는 매개변수를 받는다. 그래서 ch 넣는다.
            else { //닫는 괄호 ')'일 경우 && )괄호로 끝날 때
                if(stack.isEmpty()) return "NO"; // stack이 데이터(요소) 여부를 체크(isEmpty()) 비어있다? -> "NO"
                stack.pop(); //비어있지 않을 경우 stack에 맨 위에 있는 값을 뺀다.
            }
        }
        //여는 괄호 '('가 많은 경우 -> '('괄호로 끝날 때의 경우
        if(!stack.isEmpty())  { //스택에 자료가 남아있다 -> 참
            return "NO";
        }
        return answer; // 닫는괄호로 끝날 때 , 여는 괄호로 끝날 때  -> YES
    }
}
