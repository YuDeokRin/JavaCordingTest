package string01;



import java.util.Locale;
import java.util.Scanner;

/**
 * 1. 문자 찾기
 *
 * 해결   1. main 생성
 *       2. Str01객체 생성
 *       3. Scanner 객체 생성 -> Scanner객체를 이용해서 String과 char를 입력받는다.
 *       4. System.out.pringln()으로 str01객체에서 참조하는 메소드를 통해서 매개변수값을 넣어준다.
 *       5. solution() 메소드 만들기 -> 메소드에서 출력은 int,  매개변수로는 String , char
 *       6. answer는 문자 몇개 인지 알려주는 변수
 *       7. String 문자열을 대문자로 바꿔주는 함수를 사용해서 저장한다.
 *       8. char을 문자를 배열로 바꿔주는 함수를 사용해서 저장한다.
 *       9. 반복문을 이용해서 String 배열로 들어간 것들을 0부터 끝까지 찾아준다.
 *       10. 그리고 입력한 char와 찾는 문자와 같으면 숫자를 올려준다.
 */

public class Str01{

    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for (char x : str.toCharArray() ) {
            if (x == c){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Str01 str01 = new Str01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(str01.solution(str, c));
    }
}