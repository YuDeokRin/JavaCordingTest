package string01;

import java.util.Scanner;

public class Str07_1 {
    public String solution(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer ="YES";

        return answer;

    }

    public static void main(String[] args) {
        Str07_1 T = new Str07_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

