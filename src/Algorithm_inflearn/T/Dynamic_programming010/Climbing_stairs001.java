package Algorithm_inflearn.T.Dynamic_programming010;
/**
 * 동적계획법
 *
 * 1. 계단오르기
 *
 * 문제의 해결 방법은 우선 그림을 통해서 그려보고 이게 어떤 개념과 유사한지 유추해본다.
 * 피보나치랑 똑같은 패턴을 보인다. 기존의 피보나치의 수열로 풀어본다.
 */

import java.util.Scanner;

public class Climbing_stairs001 {
    static int[] dy;
    public int solution(int n){
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i- 2] + dy[i-1];
        }
        return dy[n];
    }
    public static void main(String[] args) {
        Climbing_stairs001 T= new Climbing_stairs001();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n+1];
        System.out.println(T.solution(n));
    }
}
