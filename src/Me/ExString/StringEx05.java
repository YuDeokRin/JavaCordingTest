package Me.ExString;

/**
 * 2022년 4월 4일 : 1회
 *  중복문자 제거
 *
 */

import java.util.Scanner;

public class StringEx05 {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0 ;
        int rt = str.length()-1;

        while(lt<rt){
            if (!Character.isAlphabetic(s[lt])){
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            }else {
                char tmp = s[lt];
                s[lt] =s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s); // s가 char로 되어있다. 그것을 String으로 바꿔주는 작업
                                    // 바꿔줘야 하느 이유 : answer는 String 타입으로 String 으로 반환해줘야하기 때문이다.
                                    // valueOf는 static 메소드이다.
        return answer;
    }

    public static void main(String[] args) {
        StringEx05 T = new StringEx05();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}
