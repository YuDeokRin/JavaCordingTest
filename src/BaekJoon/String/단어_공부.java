package BaekJoon.String;
/*
 1157. 단어 공부

 -문제
 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 단, 대문자와 소문자를 구분하지 않는다.

 -입력예제)
 Mississipi
 -출력예제)
 ?

 -입력예제2)
  zZa
 -출력예제2)
  Z

 Tip. str.equalsIgnoreCase() : 대소문자 고려를 무시하고 이 문자열을 다른 문자열과 비교합니다.
                               두 문자열의 길이가 같고 두 문자열의 해당 문자가 동일한 경우 대소문자를 무시하고 동일한 것으로 간주됩니다.

'A' = 65
'Z' = 90;


 */

import java.util.Scanner;

public class 단어_공부 {
    public char solution(String s, int[] alphabet) {
        s = s.toUpperCase(); // 다 대문자로 바꿔준다.
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // s.charAt(i)가 대문자 A ~ Z 까지 범위포함되어야 참
                alphabet[s.charAt(i) - 'A']++; //해당 인덱스값 1 증가
            }
        }

        int max = 0;
        char ch = '?';

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                ch = (char) (i + 65); // 대문자로 출력으로 인해 65를 더해준다.
            } else if (alphabet[i] == max) {
                ch = '?';
            }
        }
        return ch;
    }

    public static void main(String[] args){
        단어_공부 T = new 단어_공부();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] alphabet = new int[26]; // A ~ Z는 총 26개
        System.out.println(T.solution(s,alphabet));
    }
}
