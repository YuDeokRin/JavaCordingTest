package ExString;



/**
 * 2022년 4월 1일 : 1회
 *
 * 대소문자 변환
 */
import java.util.Scanner;
class StringEx02 {

    public String solution(String str){
        String answer ="";
        for (char c : str.toCharArray()) {

            //변수 c가 소문자인가?  소문자면 true, 아니면 false
            if (Character.isLowerCase(c)) {

                // true의 경우 : 변수 c가 소문자면
                answer = answer + Character.toUpperCase(c);

            } else {
                // false의 경우 : 변수 c가 대문자이면 소문자로 바꾼다.
                answer = answer + Character.toLowerCase(c);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StringEx02 T= new StringEx02();
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }

}