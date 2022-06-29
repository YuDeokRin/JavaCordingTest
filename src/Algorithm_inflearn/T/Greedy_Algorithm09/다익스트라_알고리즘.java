package Algorithm_inflearn.T.Greedy_Algorithm09;
/*
    5. 다익스트라 알고리즘

    -문제
    입력을 보고 그림을 그리고 가중치 방향그래프에서 1번 정점에서 모든 정점으로의 최소 거리비용을 출력하는 프로 그램을 작성하세요. (경로가 없으면 Impossible를 출력한다)

    입력 설명)
    첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다.
    그 다음부터 M줄에 걸쳐 연 결정보와 거리비용이 주어진다.

    출력 설명)
    1번 정점에서 각 정점으로 가는 최소비용을 2번 정점부터 차례대로 출력하세요.

    입력)
6 9 //6은 정점, 9는 간선의 개수
1 2 12 // 1번 정점에서 2번정점으로 가는데 12의 비용이 든다.
1 3 4
2 1 2
2 3 5
2 5 5
3 4 5
4 2 2
4 5 5
6 4 5



    출력)
2:11
3:4
4:9
5:14
6 : impossible


 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{

    int vex; // 정점(vertex) 번호를 저장
    int cost; // cost는 간선의 가중치 값을 저장한다.

    Edge(int vex, int cost){
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost; // cost를 오름차순 정렬 시킨다. 그렇게되면 foreach문이 실행될 때, 가장 작은 값을 우선으로 for를 시켜준다.
                                   // 반대로 가장 큰 값부터 for에서 꺼내줄려면 -> return o.cose - this.cost 즉, 내림차순으로 해줘야한다.
    }
}

public class 다익스트라_알고리즘 {
        static int n, m;
        static ArrayList<ArrayList<Edge>> graph; // ArrayLsit인데 ArrayLsit 객체를 저장하는 것
        static int[] dis;
        public void solution(int v){ // 처음 1을 받는다.
             PriorityQueue<Edge> pQ = new PriorityQueue<>(); //우선순위를 써야하는 이유 : 그냥 for문을 돌릴 시, 시간 복잡도를 O(n)이다.
                                                             //                     하지만 PriorityQueue<>를 사용한다면 n log n의 시간 복잡도가 시행된다. 데이터가 많을 때 훨씬 빠르다.
            pQ.offer(new Edge(v, 0)); // 첫번째 값 : (1,0) ,
            dis[v] = 0; // dis[1] = 0 ,

            //다익스트라 알고리즘
            while (!pQ.isEmpty()) { // pQ가 들어있다면 참
                Edge tmp = pQ.poll();  // (vex = 1, cost = 0)을 꺼내준다.  가장 작은 값을 꺼내준다. 작은 값의 기준은 cost
                int now = tmp.vex; // now = 1  -> now는 1번 정점
                int nowCost = tmp.cost; // nowCost = 0  -> now까지 가는데 비용
                if(nowCost > dis[now]) continue; // 12 > 11
                for (Edge ob : graph.get(now)) { // graph.get(1) , graph.get(2), graph.get(3), graph.get(4), graph.get(5), graph.get(6)
                    if(dis[ob.vex] > nowCost + ob.cost){ // dis[2]는 Integer.MAX_VALUE이다.    ob.vex :  2,  ob.cost : 12  , nowCost = 0, ob.cost = 12
                        dis[ob.vex] = nowCost + ob.cost; // dis[ob.vex] = 0 + 12;
                        pQ.offer(new Edge(ob.vex, nowCost + ob.cost)); // ob.vex = 2 , nowCost+ob.cost = 12를 pQ에 넣어준다.
                    }
                }
            }
        }
    public static void main(String[] args) {
        //입력  : n = 6, m =9  -> static으로 선언 이유 : 메인메소드 말고 다른 곳에서 사용하려고
        다익스트라_알고리즘 T = new 다익스트라_알고리즘();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new ArrayList<ArrayList<Edge>>(); // 객체 생성 : Edge라는 객체를 저장할 수 있는  ArrayList를 저장할 수 있는 ArrayLsit

        for (int i = 0; i <=n; i++) { // 0번 부터 n번까지의 객체를 만든다.
            graph.add(new ArrayList<Edge>());
        }

        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            graph.get(a).add(new Edge(b, c));
        }

        T.solution(1); // 1번 정점에서 출발
        for (int i = 2; i <= n; i++) {
            if(dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
            else System.out.println(i + " : impossible" );
        }
    }
}
