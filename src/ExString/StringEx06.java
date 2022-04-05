package ExString;

import java.util.Scanner;

/**
 * 중복문자제거
 *
 *
 */
public class StringEx06 {
    private String solution(String str) {
        String answer = "";
        for (int i =0; i<str.length(); i++) {
           if(str.indexOf(str.charAt(i)) == i){
               answer = answer + str.charAt(i);

               /*
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
           }
        }

        return answer;
    }
    public static void main(String[] args) {
        StringEx06 T = new StringEx06();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}
