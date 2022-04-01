package string01;

import java.util.Scanner;

public class Str03 {
    public String solution(String str ) {
        String answer ="";
        int m = Integer.MIN_VALUE;  //자바에서 정수(int)의 최소값
        String[] s =str.split(" ");
        for (String x : s) {
            int len =x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Str03 T = new Str03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

}
