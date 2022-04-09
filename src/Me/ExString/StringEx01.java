package Me.ExString;

    /**
     * 2022년 4월 1일 : 1회
     *
     * 익혀야할 함수
     * 1. 문자열.toUpperCase()  -> 문자열들을 대문자로 바꿔준다.
     * 2. Character.toUpperCase() ->  문자를 대문자로 바꿔준다.
     * 3. char -  charAT(int index) -> 지정된 인덱스의 char 값을 반환한다.
     * 4. String.toCharArray() -> 문자열을 새 문자 배열로 반환합니다.
     */
import java.util.Scanner;

public class StringEx01 {

    public static class StrEx01 {

        public int solution(String str, char t){
            int answer = 0;
            str = str.toUpperCase();
            t = Character.toUpperCase(t);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == t){
                    answer++;
                }
            }

    //        다른 방법의 for 문 (for each)
    //
    //        for (char x : str.toCharArray() ) {
    //            if(x == t){
    //                answer++;
    //            }
    //
    //        }

            return answer;
        }

        public static void main(String[] args) {
            StrEx01 strEx01 = new StrEx01(); //heap 메모리에 올라간다.
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            char c = sc.next().charAt(0); //sc.next() ->문자열을 가져온다 , sc.next().charAt()-> 문자열을 인덱스로 접
            System.out.println(strEx01.solution(str, c));
        }

    }
}
