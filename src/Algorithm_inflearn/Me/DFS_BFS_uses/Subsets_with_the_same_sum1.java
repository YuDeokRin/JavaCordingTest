package Algorithm_inflearn.Me.DFS_BFS_uses;

import java.util.Scanner;

/**
 * 1. 합이 같은 부분집합
 */
public class Subsets_with_the_same_sum1 {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr ) {
        if(flag) return;
        if (sum>total/2 )
        if (L==n){
            if ((total-sum) == sum){
                answer = "YES";
                flag = true;
            }

        }
        else { // 부분집합구함
            DFS(L+1, sum + arr[L], arr);
            DFS(L+1, sum, arr);
        }

    }

    public static void main(String[] args) {
        Subsets_with_the_same_sum1 T = new Subsets_with_the_same_sum1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i]; // 값을 받고 토탈값을 바로 받는다

        }
        T.DFS(0, 0, arr);
        System.out.println(answer);

    }
}
