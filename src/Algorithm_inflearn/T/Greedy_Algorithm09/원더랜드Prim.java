package Algorithm_inflearn.T.Greedy_Algorithm09;
/*
    8. 원더랜드(프림 : PriorityQueue)

    알고리즘 분류 : Prim's algorithm

    Prim's 특징
    - 무방향 그래프
    - 가중치가 있음

    Prim's algorithm 작동순서
    1. 그래프에서 하나의 정점의 선택하여 트리를 만든다.
    2. 그래프의 간선이 들어있는 집합을 만든다.
    3. 모든 정점이 트리에 포함되어 있지 않는 동안 -> 트리와 연결된 간선 가운데 트리 속의 두 정점을 연결하지 않는 가장 가중치가 작은 간선을 트리에 추가한다.

    알고리즘이 종료 되었을 때 만들어진 트리를 최소 비용 신장트리라고 한다.

    시간 복잡도 : O(E log V)  -> E는 간선 , V는 정점




 */

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge8 implements Comparable<Edge8>{
    int vex;
    int cost;

    Edge8(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge8 o) {
        return this.cost - o.cost; // 작은값으로 우선순위를 해준다.
    }
}

public class 원더랜드Prim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<ArrayList<Edge8>> graph = new ArrayList<ArrayList<Edge8>>(); //인접 리스트
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge8>()); // 객체들 생성
        }

        int[] ch = new int[n + 1]; //체크 배열 만들기
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            graph.get(a).add(new Edge8(b, c)); //무방향이라서 앞말고도 뒤로도 갈 수 있기때문에 2개를 만든다.
            graph.get(b).add(new Edge8(a, c));
        }
        int answer = 0 ; // 최소비용 담는 변수
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(1, 0)); // pQ에 처음 1,0을 넣는다. -> 1번정점 가는데 비용은 0이다.
        while(!pQ.isEmpty()){
            Edge tmp = pQ.poll(); // 처음은 (1,0)이 꺼내진다.
            int ev = tmp.vex; // 도착 정점(end vertex)
            if(ch[ev] == 0){
                ch[ev] = 1; //회로를 방지
                answer += tmp.cost; // tmp.cost는 간선의 비용
                for (Edge8 ob : graph.get(ev)) {
                    if(ch[ob.vex] == 0) pQ.offer(new Edge(ob.vex, ob.cost)); // ch[ob.vex] == 0 -> 전에왔던 경로를 탐색할 때 갈 수 있는지 확인
                }
            }
        }
        System.out.println(answer);




    }
}
