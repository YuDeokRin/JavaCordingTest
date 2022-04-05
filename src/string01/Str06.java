package string01;

/**
 * 중복문자제거
 *
 * 사용되는 함수 : indexOf()
 */

import java.util.Scanner;

public class Str06 {
     public String solution(String str){
         String answer = "";
         for (int i =0; i<str.length(); i++){
             //String.charAt(i), i , String.indexOf(charAt(i)) 를 사용해서 세가지를 비교할 수 있다. 꼭 출력해서 확인해보기
             //System.out.println(str.charAt(i)+ "----"+ i + "----" + str.indexOf(str.charAt(i)));
             /*
             출력 결과
             ksekkset

               str.charAt(i)      i              str.indexOf(str.charAt(i))
               k------------------0------------- 0
               s------------------1------------- 1
               e------------------2------------- 2
               k------------------3------------- 0
               k------------------4------------- 0
               s------------------5------------- 1
               e------------------6------------- 2
               t------------------7------------- 7

             */

             if (str.indexOf(str.charAt(i))==i) {
                 answer = answer +  str.charAt(i); // i를 누적해준다.
             }
         }
         return answer;
     }

    public static void main(String[] args) {
        Str06 T = new Str06();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}


