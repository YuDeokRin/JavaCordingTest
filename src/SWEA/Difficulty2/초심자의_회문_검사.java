package SWEA.Difficulty2;

import java.util.Scanner;

/**
 * 1989. 초심자의 회문 검사
 */

public class 초심자의_회문_검사 {

    public String solution(String str) {
        String answer= "1";
        String s = new StringBuilder(str).reverse().toString();
        if (str.equals(s)){
            return answer;
        }
        return "0";
    }

    public static void main(String[] args) {
        초심자의_회문_검사 T = new 초심자의_회문_검사();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String str = sc.next();
            System.out.println("#" + i + " " + T.solution(str));
        }
    }
}
