package BaekJoon.StackAndQueue;

import java.io.*;
import java.util.Stack;

/*
    1918. 후위 표기식

    -문제
    https://www.acmicpc.net/problem/1918



    입력
    첫째 줄에 중위 표기식이 주어진다. 단 이 수식의 피연산자는 알파벳 대문자로 이루어지며 수식에서 한 번씩만 등장한다.
    그리고 -A+B와 같이 -가 가장 앞에 오거나 AB와 같이 *가 생략되는 등의 수식은 주어지지 않는다. 표기식은 알파벳 대문자와 +, -, *, /, (, )로만 이루어져 있으며, 길이는 100을 넘지 않는다.

    출력
    첫째 줄에 후위 표기식으로 바뀐 식을 출력하시오

    예제 입력 1
    A*(B+C)

    예제 출력 1
    ABC+*

    예제 입력 2
    A+B
    예제 출력 2
    AB+

    예제 입력 3
    A+B*C
    예제 출력 3
    ABC*+

    예제 입력 4
    A+B*C-D/E
    예제 출력 4
    ABC*+DE/-
 */
public class 후위표기식 {
    public static void print(){

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String s = br.readLine();

        for (Character ch : s.toCharArray()) {
            if(ch.isAlphabetic(ch)){ // 알파벳이면
                sb.append(ch); // sb에 추가
            }else if(ch == '(') { // '-'이면
                stack.push(ch);
            } else if(ch ==')'){ //알파벳이 아닐경우
                while (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    sb.append(stack.pop());
                }
            }else{
                while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);

    }

    private static int precedence(Character ch) {
        if(ch == '(') return 0;
        if(ch == '+' || ch == '-') return 1;
        else return 2;
    }
}
