package Me.ExString;

/**
 * 2022년 4월 6일  : 1회
 *
 */

import java.util.Scanner;

public class StringEx08 {
    public String solution(String str){
        String answer  = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)){
            answer = "YES";

        }

        return answer;
        
    }
    public static void main(String[] args) {
        StringEx08 T = new StringEx08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
        
    }
}
