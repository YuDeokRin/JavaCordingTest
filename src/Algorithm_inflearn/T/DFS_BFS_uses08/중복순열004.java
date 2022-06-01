package Algorithm_inflearn.T.DFS_BFS_uses08;
/**
 * 4.중복순열
 *
 * 1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열 하는 방법을 모두 출력합니다.
 *
 */

import java.util.Scanner;

public class 중복순열004 {
    static int n, m;
    static int[] pm;
    public void DFS(int L) {
        if(L==m){ // L(level)이 m이면, m개를 뽑았다는 것
            for(int x : pm) System.out.print(x + " ");
            System.out.println(); //줄바꿈
        }
        else{
            //n개의 엣지를 뻗는다.
            for(int i = 1; i<=n; i++){
                pm[L]=i;
                DFS(L+1); // n번의 호출 : n은 3  - 1, 2, 3
            }
        }
    }

    public static void main(String[] args) {
        중복순열004 T = new 중복순열004();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // input : 3
        m = sc.nextInt(); // input : 2
        pm = new int[m]; // m개의 배열 공간 생성
        T.DFS(0); //level : 0부터 탐색
    }
}
