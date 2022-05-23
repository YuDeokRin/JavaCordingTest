package Algorithm_inflearn.T.DFS_BFS_uses08;

import java.util.Scanner;

/**
 * 1. 합이 같은 부분집합
 *
 * DSF를 이용해서 1 3 5 6 7 10 의 부분 집합을 구한다.
 *
 */
public class Subsets_with_the_same_sum001 {
    static String answer = "NO";
    static int n, total = 0;  // DFS 에서 써야하기 때문에 전역변수로 설정
    boolean flag = false; // YES가 발견되면 다른 재귀들을 리턴해주기 위해서 만든다.

    public void DFS(int L, int sum, int[] arr ) {
        if(flag) return ;
        if(sum>total/2) return;
        if (L == n) {
            if ((total - sum) ==sum){
                answer = "YES";
                flag = true; // 더이상 돌지않아도 되기때문에 true를 넣어준다.
            }
        }else {//부분집합 구하기
            DFS(L+1, sum+arr[L], arr);
            DFS(L + 1, sum, arr);
        }

    }

    public static void main(String[] args) {
        Subsets_with_the_same_sum001 T = new Subsets_with_the_same_sum001();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; // 전체집합으로 이루어진 원소들 넣어주기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total+= arr[i];
        }
        T.DFS(0,0, arr);
        System.out.println(answer);
    }
}

