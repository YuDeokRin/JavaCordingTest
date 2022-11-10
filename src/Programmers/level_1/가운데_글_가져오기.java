package Programmers.level_1;

import java.util.Scanner;

public class 가운데_글_가져오기 {
    public static void main(String[] args) {
        가운데_글_가져오기 T = new 가운데_글_가져오기();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }

    public String solution(String s) {
        String answer = "";
        int num = s.length();

        if(num % 2 == 0) { //짝수
            answer = s.substring(num/2 - 1, num/2 +1);
        }else{ // 홀수
            answer = s.substring(num/2, num/2 + 1);
        }

        return answer;
    }
}
