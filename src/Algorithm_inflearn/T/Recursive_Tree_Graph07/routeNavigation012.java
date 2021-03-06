package Algorithm_inflearn.T.Recursive_Tree_Graph07;

import java.util.Scanner;

/**
 * 12. 경로탐색(DFS)
 */

public class routeNavigation012 {
    static int n,m,answer= 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v){
        if(v ==n ) answer++;
        else{
            for (int i = 1; i <=n; i++) {
                if (graph[v][i] == 1 && ch[i]==0){
                    ch[i] =1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        routeNavigation012 T = new routeNavigation012();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점의 개수
        m = sc.nextInt(); // 간선의 개수
        graph = new int[n+1][n+1];
        ch = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;  //입력한 a,b의 좌표에 1을 넣어준다.
        }
        ch[1] = 1; // check배열에 우선 1을 넣어준다.
        T.DFS(1);
        System.out.println(answer);
    }
}
