package Algorithm_inflearn.T.Recursive_Tree_Graph07;
/**
 * 14. 그래프 최단거리(BFS)
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class graph_shortest_distance014 {
    static int n, m ;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch,dis;

    public void BFS(int v) {
        ch[v] = 1;
        dis[v]  = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while(!queue.isEmpty()){
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0){
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;

                }
            }
        }
    }
    public static void main(String[] args) {
        graph_shortest_distance014 T = new graph_shortest_distance014();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점의 개수 : 6
        m = sc.nextInt(); //간선의 개수 : 9
        //인접리스트
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <=n; i++) {
            graph.add(new ArrayList<Integer>()); // n번 객체 생성
        }

        ch = new int[n + 1]; //check 배열 만들기
        dis = new int[n + 1]; // 거리 배열  , 1번부터 n번까지 있어야하기 때문에 n+1로 

        //인접리스트 만들기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
        
    }
}
