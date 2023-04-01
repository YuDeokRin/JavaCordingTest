package Algorithm_inflearn.T.Dynamic_programming010;
/*
    동적계획법

  1. 계단오르기
  철수는 계단을 오를 때 한 번에 한 계단 또는 두 계단씩 올라간다. 만약 총 4계단을 오른다면 그 방법의 수는
  1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 로 5가지이다.
  그렇다면 총 N계단일 때 철수가 올라갈 수 있는 방법의 수는 몇 가지인가?


  문제의 해결 방법은 우선 그림을 통해서 그려보고 이게 어떤 개념과 유사한지 유추해본다.
  피보나치랑 똑같은 패턴을 보인다. 기존의 피보나치의 수열로 풀어본다.

  입력
  첫째 줄은 계단의 개수인 자연수 N(3≤N≤35)이 주어집니다.


  출력
  첫 번째 줄에 올라가는 방법의 수를 출력합니다.


  예시 입력 1
  7
  예시 출력 1
  21
 */

import java.util.Scanner;

public class 계단오르기001{
    static int[] dy;
    public int solution(int n){
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i -2] + dy[i -1];

        }
        return dy[n];
    }
    public static void main(String[] args) {
        계단오르기001 T= new 계단오르기001();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n+1];
        System.out.println(T.solution(n));
    }
}
