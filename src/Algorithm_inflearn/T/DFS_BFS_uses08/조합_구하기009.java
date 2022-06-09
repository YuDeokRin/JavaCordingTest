package Algorithm_inflearn.T.DFS_BFS_uses08;
/**
 * 9. 조합 구하기
 *
 * 조합 : 서로 다른 n개의 원소를 가지는 어떤 집합(사실, 집합은 서로 다른 원소의 모임으로 정의된다.)에서 순서에 상관없이 r개의 원소를 선택하는 것이다.
 *
 *
 */

import java.util.Scanner;

public class 조합_구하기009 {
    static int n, m;
    static int[] combi;


    private void DFS(int L , int s) {
        if(L==m) { // 완
         for(int x : combi) System.out.print(x + " ");
         System.out.println();
        }else{
            for(int i = s; i<=n; i++){
                combi[L] = i;
                DFS(L+1, i+1); // i + 1인 이유는 i 뻗은 수의 + 1
            }
        }
    }

    public static void main(String[] args) {
        조합_구하기009 T = new 조합_구하기009();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // n개의 물건
        m = sc.nextInt(); // m개 뽑는다.
        combi =new int[m];
        T.DFS(0, 1); // L = level , s = start num
    }
}
