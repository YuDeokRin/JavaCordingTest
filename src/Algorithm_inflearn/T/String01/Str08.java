package Algorithm_inflearn.T.String01;

import java.util.Scanner;

public class Str08 {
    public String solution(String str){
        String answer = "NO";
        //replaceAll() : 정규식으로 표현
        // [^A-Z] : ^(부정) A부터 Z까지
        str =str.toUpperCase().replaceAll("[^A-Z]", " ");

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) answer ="YES";

        return answer;
    }

    public static void main(String[] args) {
        Str08 T = new Str08();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
