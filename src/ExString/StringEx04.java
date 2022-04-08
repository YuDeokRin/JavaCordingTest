package ExString;
/**
 * 2022년 4월 2일 : 1회
 *
 *
 * 단어 뒤집기
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StringEx04 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString(); // toString -> 스트링 객체로 만들어준다.(스트링화) 그래야지 들어간다.
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        StringEx04 T = new StringEx04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단어가 몇개 들어오는지 받는 변수
        String[] str = new String[n]; //n개의 단어를 넣어서 동적으로 만들어준다.

        //입력 for문
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        //출력 for문
        for (String x : T.solution(n, str)){
            System.out.println(x);
        }

    }
}
