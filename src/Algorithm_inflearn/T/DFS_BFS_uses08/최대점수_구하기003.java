package Algorithm_inflearn.T.DFS_BFS_uses08;
/**
 * 3. 최대점수 구하기(DFS)
 */

import java.util.Scanner;

public class 최대점수_구하기003 {
    static int n,m;
    static int answer =Integer.MIN_VALUE;

    public void DFS(int L, int sum,int time, int[] ps, int[] pt) {
        if(time>m) return; // 총 문제 푼 시간이 제한시간인 m을 넘으면 return 해준다.
        if(L==n){ //부분집합이 완성되면
            answer= Math.max(answer, sum); //기존의 answer보다 sum이 크면 버꿔준다.
        }else{
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt); //sum +ps[L] 문제를 푼다. , time + pt[L] 시간이 걸린다.
            DFS(L+1, sum, time, ps, pt); //문제를 안풀때
        }
    }

    public static void main(String[] args) {
        최대점수_구하기003 T = new 최대점수_구하기003();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 문제의 개수
        m = sc.nextInt(); //  제한 시간
        int[] a = new int[n]; //점수
        int[] b = new int[m]; // 걸리는 시간
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        T.DFS(0,0,0, a, b);
        System.out.println(answer);

    }
}
