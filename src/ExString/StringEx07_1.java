package ExString;
/**
 * str.equalsIgnoreCase() : 대소문자 고려를 무시하고 이 문자열을 다른 문자열과 비교합니다.
 *                          두 문자열의 길이가 같고 두 문자열의 해당 문자가 동일한 경우 대소문자를 무시하고 동일한 것으로 간주됩니다.
 *
 */

import java.util.Scanner;

public class StringEx07_1 {
    private String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        StringEx07_1 T = new StringEx07_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
