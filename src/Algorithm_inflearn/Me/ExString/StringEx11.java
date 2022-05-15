package Algorithm_inflearn.Me.ExString;

import java.util.Scanner;

/**
 * 2022년 4월 8일 : 1회
 * 11.문자열 압축
 */
public class StringEx11 {
    private String solution(String s) {
        String answer = "";
        int cnt = 1;
        s = s + " ";
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            }else {
                answer += s.charAt(i);
                if (cnt > 1){
                    answer = answer + String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StringEx11 T = new StringEx11();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}