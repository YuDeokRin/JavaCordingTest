package T.String01;

/**
 * 회문 문자열
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 한다.
 *
 *  Tip. length/2
 *      다른 풀이 방법 : Stringbuilder().reverse().toString();
 *                    String.equals()
 *                    String.equalsIgnoreCase()
 */


import java.util.Scanner;

public class Str07 {
    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase(); // 대소문자 상관없게 만든다.
        int len = str.length();
        for(int i =0 ; i<len/2; i++){
            if(str.charAt(i)!= str.charAt(len-i-1)) return "NO";

        }

        return answer;

    }

    public static void main(String[] args) {
        Str07 T = new Str07();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
