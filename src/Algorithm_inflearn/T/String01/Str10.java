package Algorithm_inflearn.T.String01;

import java.util.Scanner;

public class Str10 {
    public int[] solution(String s, char t){
        int[] answer = new int[s.length()]; //0 ~ 10번까지 생기는 int형 배열
        int p = 1000; // p 는 거리
        for(int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p =1000;
        for(int i = s.length()-1; i>=0; i--){
            if (s.charAt(i)== t) {
                p= 0;
            } else{
                p++;
                answer[i] = Math.min(answer[i], p); // 기존의 값과 p 중에서 작은 값으로 넣어라
            }
        }
      return answer;
    }

    public static void main(String[] args) {
        Str10 T = new Str10();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); // 문자열 읽기
        char c = kb.next().charAt(0); // 문자 읽기
        for (int x : T.solution(str, c)){
            System.out.println(x + " ");
        }
    }
}
