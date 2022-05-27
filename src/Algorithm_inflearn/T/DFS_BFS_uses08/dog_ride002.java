package Algorithm_inflearn.T.DFS_BFS_uses08;
/**
 * 2. 바둑이 승차(DFS)
 */

import java.util.Scanner;
public class dog_ride002 {
    static int answer = Integer.MIN_VALUE ;
    static int n;
    static int c;

    public void DFS(int L, int sum, int[] arr){
        if(sum>c) return;
        if(L==n) { //부분집합이 완성될때 조건 (L==n)
            answer = Math.max(answer, sum); // 기존 answer 보다 sum이 크면 바꿔준다.
        }else {
            DFS(L+1,sum+arr[L] ,arr); // o
            DFS(L+1,sum ,arr); // x
        }
    }
    public static void main(String[] args) {
        dog_ride002 T = new dog_ride002();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt(); // 수용 무게
        n = sc.nextInt();  // 강아지 마리 수
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
