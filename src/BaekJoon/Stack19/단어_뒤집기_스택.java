package BaekJoon.Stack19;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

/*
    9093. 단어뒤집기
    스택으로 구현

   https://www.acmicpc.net/problem/9093

 */

public class 단어_뒤집기_스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (n-- > n) {
            String str = bf.readLine() + "\n";
            Stack<Character> stack = new Stack<>();
            for (char ch : str.toCharArray()) {
                if (ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                }else{
                    stack.push(ch);
                }
            }
        }
        bw.flush();
    }
}
