package string01;

/**
 * 문자열 압축
 */

import java.util.Scanner;

public class Str11 {
        public String solution(String s){
            String answer = "";
            s = s + " ";
            int cnt = 1 ;
            for (int i = 0; i < s.length()-1 ; i++) {
                if(s.charAt(i) == s.charAt(i+1)){
                    cnt++;
                }else{
                    answer += s.charAt(i);
                    if(cnt > 1){
                        answer += String.valueOf(cnt);
                    }
                        cnt = 1;
                }
            }
            return answer;
        }
        public static void main(String[] args) {
            Str11 T = new Str11();
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(T.solution(s));
        }
}
