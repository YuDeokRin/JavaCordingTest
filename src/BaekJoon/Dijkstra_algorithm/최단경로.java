package BaekJoon.Dijkstra_algorithm;

/*
    1753. 최단경로(골드 4)

    -문제
    방향그래프가 주어지면 주어진 시작점에서 다른 모든 정점으로의 최단 경로를 구하는 프로그램을 작성하시오. 단, 모든 간선의 가중치는 10 이하의 자연수이다.

    입력)
    첫째 줄에 정점의 개수 V와 간선의 개수 E가 주어진다. (1 ≤ V ≤ 20,000, 1 ≤ E ≤ 300,000) 모든 정점에는 1부터 V까지 번호가 매겨져 있다고 가정한다.
    둘째 줄에는 시작 정점의 번호 K(1 ≤ K ≤ V)가 주어진다.
    셋째 줄부터 E개의 줄에 걸쳐 각 간선을 나타내는 세 개의 정수 (u, v, w)가 순서대로 주어진다.
    이는 u에서 v로 가는 가중치 w인 간선이 존재한다는 뜻이다.
    u와 v는 서로 다르며 w는 10 이하의 자연수이다. 서로 다른 두 정점 사이에 여러 개의 간선이 존재할 수도 있음에 유의한다.

    출력)
    첫째 줄부터 V개의 줄에 걸쳐, i번째 줄에 i번 정점으로의 최단 경로의 경로값을 출력한다.
    시작점 자신은 0으로 출력하고, 경로가 존재하지 않는 경우에는 INF를 출력하면 된다.


입력
5 6
1
5 1 1
1 2 2
1 3 3
2 3 4
2 4 5
3 4 6


출력
0
2
3
7
INF

    알고리즘 분류 : 그래프 이론, 다익스트라 알고리즘
 */

import java.util.*;

class Edge1753 implements Comparable<Edge1753>{

    int vex; //정점
    int cost; // 가중치(비용)

    public Edge1753(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }


    @Override
    public int compareTo(Edge1753 o) {
        return this.cost - o.cost; //cost(비용)을 기준으로 오름차순 정렬
    }
}

public class 최단경로{
    static int V, E, K; // static 으로 선언 하는 이유 찾기 !
    static ArrayList<ArrayList<Edge1753>> graph;

    static int[] dis;


    private void solution(int v) {
        PriorityQueue<Edge1753> pQ = new PriorityQueue<>();

        pQ.offer(new Edge1753(v, 0));
        dis[v] = 0;


        while (!pQ.isEmpty()) {
            Edge1753 tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if (nowCost > dis[now]) continue;
            for (Edge1753 ob : graph.get(now)) {
                if (dis[ob.vex] > nowCost + ob.cost) {
                    dis[ob.vex] = nowCost + ob.cost;
                    pQ.offer(new Edge1753(ob.vex, nowCost + ob.cost));
                }
            }
        }


    }

    public static void main(String[] args) {
        최단경로 T = new 최단경로();
        Scanner in = new Scanner(System.in);
        V = in.nextInt(); // 정점의 개수 : 5
        E = in.nextInt(); // 간선의 개수 : 6
        K = in.nextInt(); // 시작하는 정점의 번호 : 1

        graph = new ArrayList<ArrayList<Edge1753>>();

        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<Edge1753>());
        }

        dis = new int[V + 1];

        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            graph.get(a).add(new Edge1753(b, c));
        }
        T.solution(K);
        for (int i = 1; i <= V; i++) {
            if(dis[i] != Integer.MAX_VALUE) System.out.println(dis[i]);
            else System.out.println("INF");
        }
    }
}