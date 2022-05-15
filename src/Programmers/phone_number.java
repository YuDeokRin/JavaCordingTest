package Programmers;
/**
 * Lv1. 핸드폰 번호 가리기
 *
 */

import java.util.Scanner;

public class phone_number {
    public String solution(String str) {
        String answer="";
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length()-4){
                answer+= "*";
            }else{
                answer += str.charAt(i);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        phone_number T = new phone_number();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));


    }
}
