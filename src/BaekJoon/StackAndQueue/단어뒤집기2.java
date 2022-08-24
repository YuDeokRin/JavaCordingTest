package BaekJoon.StackAndQueue;
/*
    17413. 단어뒤집기 2

    -문제
    문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
    먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.
    알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
    문자열의 시작과 끝은 공백이 아니다.
    '<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
    태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다.
    단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.

    입력
    첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.

    출력
    첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.

    -예제 입력 1
    noojkeab enilno egduj

    - 예제 출력
    noojkeab enilno egduj


 */
import java.io.*;
import java.util.Stack;

public class 단어뒤집기2 {

    public static void print(BufferedWriter bw, Stack<Character> stack)throws IOException{
        while (!stack.isEmpty()) { //비어 있지않으면 - > 참
            bw.write(stack.pop()); // 비어질 때 까지 pop() -> 출력
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 입력
        Stack<Character> stack = new Stack<>(); // 스택 만들기
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean tag = false; // 태그 변수를 줘어서 태그인지 아닌지 확인

        for (char ch : str.toCharArray()) {
            if (ch == '<') {
                print(bw,stack);
                tag = true;
                bw.write(ch);
            } else if (ch == '>') {
                tag = false;
                bw.write(ch);
            }else if(tag){
                bw.write(ch);
            }else{
                if (ch == ' ') {
                    print(bw,stack);
                    bw.write(ch);
                }else{
                    stack.push(ch);
                }
            }
        }
        print(bw,stack); // 스택이 비어있지 않을 수도있을 경우 때문에 마지막 출력
        bw.flush();
    }
}
