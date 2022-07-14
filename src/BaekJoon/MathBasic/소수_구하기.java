package BaekJoon.MathBasic;

import java.util.Scanner;

/*
   1929. 소수 구하기

   -문제
   M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

   입력)
   첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

   출력)
   한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

   입력 예제)
   3 16

   출력 예제)
    3
    5
    7
    11
    13

    -알고리즘 분류 : 수학, 정수론, 소수 판정, 에라토스테네스의 체

 */


public class 소수_구하기 {
    public static boolean[] prime;
    public static void Eratosthenes(){
        prime[0] = prime[1] = true; //0과 1은 소수에서 제외

        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        prime = new boolean[n + 1];
        Eratosthenes();

        for (int i = m; i <= n; i++) {
            if (!prime[i]) System.out.println(i);
        }

    }
}
