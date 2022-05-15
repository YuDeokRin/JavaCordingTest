package Algorithm_inflearn.Me.ExString;

/**
 * 2022년 4월 1일 : 1회
 *
 */

import java.util.Scanner;

public class StringEx03 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE; //-2147483648
        String[] s = str.split(" "); //띄어쓰기로 구분해준다.

        //최소값, 최대값 구하는 구조
        for (String x : s) {
            int len = x.length(); //각각의 길이가 len에 들어감.
            if (m < len) {
                m = len ;
                answer = x;

            }
        }


        return answer;
    }

    public static void main(String[] args) {
        StringEx03 T = new StringEx03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));

    }
}
