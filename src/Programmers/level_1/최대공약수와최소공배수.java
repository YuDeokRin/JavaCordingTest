package Programmers.level_1;

import java.util.Arrays;
import java.util.Scanner;
/*
    최대공약수와 최소공배수

    -문제
    두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
     예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 */
public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big = Math.max(n, m);
        int small = Math.min(n, n);

        answer[0] = gcd(big, small);
        answer[1] = big * small / answer[0];

        return answer;
    }

    static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }


    public static void main(String[] args) {
        최대공약수와최소공배수 T = new 최대공약수와최소공배수();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(Arrays.toString(T.solution(n, m)));
        
    }
}
