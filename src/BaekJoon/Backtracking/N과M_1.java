package BaekJoon.Backtracking;

/*

15649. N과 M (1)

-문제
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열

-입력
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

-출력
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
수열은 사전 순으로 증가하는 순서로 출력해야 한다.

입력예제1)
3 1

출력예제1)
1
2
3

*/

import java.util.Scanner;

public class N과M_1 {
    static int n, m;
    static int[] ch, pm;

    public void DFS(int L) {
        if (L==m){
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for (int i = 1; i <= n; i++) {
                if (ch[i] ==0){
                    ch[i] = 1;
                    pm[L] = i;
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        N과M_1 T = new N과M_1();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n+1];
        pm = new int[m];
        T.DFS(0);
    }
}
