package Algorithm_inflearn.T.Recursive_Tree_Graph07;
/**
 * 13.경로탐색(인접리스트)
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class routeSearch_adjacency_list013 {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int ch[];

    public void DFS(int v) {
        if (v ==n) answer++;
        else{
            for (int nextv : graph.get(v)) {
                //노드가 탐색했을 경우, 안했을 경우
                if (ch[nextv] == 0){
                    ch[nextv] = 1;
                    DFS(nextv);
                    ch[nextv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        routeSearch_adjacency_list013 T = new routeSearch_adjacency_list013();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <=n; i++) {
            graph.add(new ArrayList<Integer>()); // 정수를 저장할 수 있는 ArrayList 생성 , 0 ~ 5(6개 ?)
        }
        ch = new int[n + 1];
        //아래 for문은 ArrayList를 완성시켜준다.
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b); // graph.get(a).add(b) -> a: 1~5, b : 1~ 5
        }
        ch[1] =1;
        T.DFS(1);
        System.out.println(answer);
    }
}
