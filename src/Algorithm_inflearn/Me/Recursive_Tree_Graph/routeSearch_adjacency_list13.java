package Algorithm_inflearn.Me.Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 13. 경로 탐색 (인접리스트) : 리스트를 사용하는 방식
 *
 * 경로 탐색에서 인접행렬은 정점의 개수가 많으면 많을수록 탐색이 너무나 비효율적이다.
 * 그래서 인접행렬을 대체해서 상대적으로 빠른 경로탐색방법 인접리스트가 있다.
 */
public class routeSearch_adjacency_list13 {
    static int n, m, answer=0;  // n : 정점의 개수 , m : 간선의 개수, answer : 모든 경로의 가지 수
    static ArrayList<ArrayList<Integer>> graph; // 그래프 연결된 정점과 간선?
    static int check[]; //탐색했던 곳인지 확인해주는 배열

    public void DFS(int v) {
        if (v==n) answer++;
        else{
            for (int nextv : graph.get(v)) {
                if (check[nextv] ==0){
                    check[nextv] = 1;
                    DFS(nextv);
                    check[nextv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        routeSearch_adjacency_list13 T = new routeSearch_adjacency_list13();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>(); //그래프 객체 생성

        //그래프 그려주기, 그래프 만들기
        // i<=n : [[], [], [], [], [], []]
        // i<n : [[], [], [], [], []]
        for (int i = 0; i <=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);   //[[], [2, 3, 4], [1, 3, 5], [4], [2, 5]]
        }
        check[1] = 1; // 처음 시작하는 정점 넣어준다.
        T.DFS(1);
        System.out.println(answer);
    }
}

