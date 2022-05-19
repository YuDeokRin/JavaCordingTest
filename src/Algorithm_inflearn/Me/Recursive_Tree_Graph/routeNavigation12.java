package Algorithm_inflearn.Me.Recursive_Tree_Graph;

import java.util.Scanner;

/**
 * 12. 경로탐색(DFS)
 * 방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프 로그램을 작성하세요.
 * 아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는 총 6가지 입니다.
 * 첫 번째 경우 : 1,2,3,4,5
 * 두 번째 경우 : 1,2,5
 * 세 번째 경우 : 1,3,4,2,5
 * 네 번째 경우 : 1,3,4,5
 * 다섯 번째 경우 : 1,4,2,5
 * 여섯 번째 경우 : 1,4,5
 *
 * 입력값 :
 * 5 9
 * 1 2
 * 1 3
 * 1 4
 * 2 1
 * 2 3
 * 2 5
 * 3 4
 * 4 2
 * 4 5
 *
 *
 * 출력값 : 6
 */
public class routeNavigation12 {
    // static을 쓰는 이유 : main메소드에서 접근하기 위해서이다.
    static int n, m ,answer=0;
    static int[][] graph;
    static int[] ch; // check 배열을 만드는 이유 : 한번 탐색한 노드는 다시 탐색 하지 않기 위해서이다.
    public void DFS(int v){
        if(v==n) answer++;
        else{ // 다른 곳(노드)으로 이동
            for (int i = 1; i <= n; i++) { // 1번부터 n번노드 까지

                // graph[v][i] == 1은 v정점에서 i번 갈 수 있는 정점을 다 찾는다. 갈 수 있으면 == 1이다. 그리고 갈 수 있는 조건은 ch[i]==0 이여야한다.
                if(graph[v][i] == 1 && ch[i]==0){ //갈 수 있다.
                    ch[i] = 1; // 갈 수 있으니 체크를 건다.
                    DFS(i);
                    ch[i] = 0; // 다시 돌아오면 체크를 풀어준다.
                }
            }
        }
    }
    public static void main(String[] args) {
        routeNavigation12 T = new routeNavigation12();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //노드의 개수(정점의 개수)
        m = sc.nextInt(); //엣지의 개수(간선의 개수)
        graph = new int[n+1][n+1]; //인접행렬를 그래프로 표 , [n+1][n+1]하는 이유 : 1번 인덱스 부터 n까지의 정점 번호가 나와야되기 때문이다.
                                   // [n+1][n+1]는 정점 번호를 의미한다. 첫 번째 n+1은 행 , 두 번째 n+1은 열
        ch  = new int[n+1]; // check 배열은 탐색한 노드인지 확인하는 배열  , n+1은  그래프와 마찬가지로 1부터 n까지 필요하기때문이다.

        //간선 갯수만큼 도는 for문  -> 간선 : 9
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b=  sc.nextInt();
            graph[a][b] = 1; // 방향 그래프
        }
        ch[1] = 1; // 1번 노드를 check를 한다.
        T.DFS(1); //
        System.out.println(answer);
    }
}
