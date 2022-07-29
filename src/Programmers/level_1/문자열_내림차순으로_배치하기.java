package Programmers.level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

/*
    Lv1. 문자열 내림차순으로 배치하기

    -문제
    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

    -제한 사항
    str은 길이 1 이상인 문자열입니다.

    -입출력 예
    s	        return
    "Zbcdefg"	"gfedcbZ"

 */
public class 문자열_내림차순으로_배치하기 {
    private String solution(String s) {
        String answer = "";
        Character[] ch = new Character[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }

        Arrays.sort(ch, Collections.reverseOrder());
        for (int i = 0; i < ch.length; i++) {
            answer += ch[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열_내림차순으로_배치하기 T = new 문자열_내림차순으로_배치하기();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(T.solution(s));
    }
}
