package Me.ExString;

import java.util.Scanner;

/**
 * 2022년 4월 7일 : 1회
 *  10. 가장 짧은 문자거리
 */
public class StringEx10 {

    private int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }
        p= 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ( s.charAt(i)==t){
                p = 0;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StringEx10 T = new StringEx10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        for (int x : T.solution(str, t)) {
            System.out.print(x + " ");
        }
    }
}
