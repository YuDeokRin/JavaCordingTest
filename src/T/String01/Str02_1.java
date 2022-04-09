package T.String01;

import java.util.Scanner;
/*
    아스키 코드 - 영어     대문자 65 ~ 90   :  x >= 65 && x<=90
              -        소문자 97 ~ 122  : x >= 97 && x<=122

 */
public class Str02_1 {
    public String solution(String str){
        String answer = "";
        for (char x  : str.toCharArray() ) {
            //소문자이면 true , 대문자이면 false
            if(x >= 97 && x<=122){
                answer= answer + (char)(x-32); //변수 x가 소문자로 들어오면 대문자 변경
            } else{
                answer= answer + (char)(x+32); //변수 x가 대문자로 들어오면 소문자 변경
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Str02_1 T = new Str02_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
