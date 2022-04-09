package Me.ExString;


/**
 * 2022년 4월 6일 : 1회
 * 숫자만 추출
 *
 */


import java.util.Scanner;
public class StringEx09 {
    public int solution(String str) {
        int answer = 0;
        str = str.replaceAll("[^0-9]", "");

        answer = Integer.parseInt(str);

        return answer ;
    }
    public static void main(String[] args) {
        StringEx09 T = new StringEx09();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 한줄을 읽을 때 사용
        System.out.println(T.solution(str));
    }
}


