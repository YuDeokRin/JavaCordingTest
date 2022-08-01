package Algorithm_inflearn.T.Recursive_Tree_Graph07;

import BaekJoon.Main;

import java.util.Scanner;

/*
    12. 경로탐색(DFS) -인접행렬



    -문제
    방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프 로그램을 작성하세요.
    1번 정점에서 5번 정점으로 가는 가지 수는 몇인가 ?

   | 1 |2 |3 |4 |5 |6  |
   --------------------
  1|   |  |  |  |  |   |
  2|   |  |  |  |  |   |
  3|   |  |  |  |  |   |
  4|   |  |  |  |  |   |
  5|   |  |  |  |  |   |
  6|   |  |  |  |  |   |


    1 2 3 4 5
    1 2 5
    1 3 4 2 5
    1 3 4 5
    1 4 2 5
    1 4 5
    총 6 가지

    -입력 설명
    첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연 결정보가 주어진다.

    -출력 설명
    총 가지수를 출력한다.

    입력 예제
    5 9
    1 2
    1 3
    1 4
    2 1
    2 3
    2 5
    3 4
    4 2
    4 5

 */

public class 경로탐색_DFS_인접행렬012 {
    static int N, M, answer = 0 ;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == N) answer++;
        else {
            for(int i = 1; i<=N; i++){
                //갈 수 있나? 없나 ?
                if (graph[v][i] == 1 && ch[i] == 0) { // 현재지점 v , i라는 정점으로
                    ch[i] = 1;
                    DFS(i); // v에서 i 이동하는 것 , 즉 v가 i가 된다는 것
                    ch[i] = 0; // check 해제

                }
            }
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        N = in.nextInt(); // 정점의 수
        M = in.nextInt(); // 간선의 수
        graph = new int[N + 1][N + 1]; //행index번호, 열index번호 =  정점 번호
        // index번호가 n번까지 생성  , 인접행렬 ! 꼭 기억
        ch = new int[N + 1]; //방문 flag

        for(int i = 0 ; i<M; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b]= 1; //방향 그래프 a에서 b로 간다. 가면 1
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }


}
