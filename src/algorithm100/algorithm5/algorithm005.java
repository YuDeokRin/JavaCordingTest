package algorithm100.algorithm5;

import java.util.Scanner;
/*
    문제
    대문자는 소문자로, 소문자는 대문자로 변환하시오.


 */
public class algorithm005 {
    public String fun(String str) {
        String answer = "";

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)== true) {
                answer += Character.toUpperCase(ch);

            }else if (Character.isUpperCase(ch) == true){
                answer += Character.toLowerCase(ch);
            }
        }

        return answer;
    }



    //  아스키코드로 소문자 범위, 대문자 범위를 선정하고 그 범위에 참인 경우 소문자는 대문자로 대문자는 소문자로 변경 후 answer에 누적 한다.
    public String ascii(String str) {
        String answer = "";
        for (char ch : str.toCharArray()) {
            if(ch >= 97 && ch <= 122) {
                answer += Character.toUpperCase(ch);
            } else if (ch >= 65 && ch <= 90) {
                answer += Character.toLowerCase(ch);
            }
        }

        return answer;
    }



    public char[] algorithm(String str) {
        char[] answer = str.toCharArray();
        for (int i = 0; i < str.length(); i++){
            if (answer[i] >= 'a' && answer[i] <= 'z') {
                answer[i] = (char)(answer[i] + 'A' - 'a'); //소문자

            } else if (answer[i] >= 'A' && answer[i] <= 'Z') {
                answer[i] = (char)(answer[i] - ('A' - 'a')); // 대문자
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        algorithm005 T = new algorithm005();
        Scanner in = new Scanner(System.in);
        String str = in.next();
//        System.out.println(T.fun(str)); // 함수 이용
//        System.out.println(T.ascii(str)); // 아스키코드 범위 이용 , 대소문자 변환은 함수
        System.out.println(T.algorithm(str)); // 범위를 이용해서 변환 (32)

    }
}
