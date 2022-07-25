package Programmers.level_1;
/*
    Lv.1 약수의 개수와 덧셈

    -문제
    두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
     약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

     제한사항
     1 ≤ left ≤ right ≤ 1,000

     입출력 예제
     left	right	result
      13	17	      43
      24	27	      52


 */
import java.util.Scanner;

public class 약수의_개수와_덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 0; j <= i; j++) {
                if(i%j == 0) cnt++; //약수인가?
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        약수의_개수와_덧셈 T = new 약수의_개수와_덧셈();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(T.solution(a,b));


    }
}
