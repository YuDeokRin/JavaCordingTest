package Algorithm_inflearn.Me.ExString;

/**
 * 2022년 4월 5일 : 1회
 * 회문문자열
 *
 */

import java.util.Scanner;

public class StringEx07 {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len  =  str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)){
                return "NO";
            }
        }

        return answer ;
    }

    public static void main(String[] args) {
        StringEx07 T = new StringEx07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}
