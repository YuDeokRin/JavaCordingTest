package BaekJoon.DataStructure;

import java.util.Scanner;
import java.util.Stack;

/**
 * 10828.스택
 */
public class 스택 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) { //14개
            String str = sc.next();
            if (str.equals("push")){
                st.push(sc.nextInt());
            } else if (str.equals("pop")) {
                if(st.isEmpty()) System.out.println(-1);
                else System.out.println(st.pop());
            } else if (str.equals("top")) {
                if(st.isEmpty()) System.out.println(-1);
                else System.out.println(st.peek());
            } else if (str.equals("size")) {
                System.out.println(st.size());
            } else if (str.equals("empty")) {
                if (st.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
        }
    }
}
