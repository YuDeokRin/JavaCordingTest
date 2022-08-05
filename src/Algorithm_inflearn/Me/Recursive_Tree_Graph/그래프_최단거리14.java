package Algorithm_inflearn.Me.Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
    14. 그래프 최단거리(BFS)

    -문제
    다음 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.

    -입력설명
    첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연 결정보가 주어진다.
    출력설명
    -1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력하세요.

    입력 예제)
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
    출력 예제)
2:3
3:1
4:1
5:2 6:2
 */
public class 그래프_최단거리14 {
    static int n,m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] dis,ch;
    public void BFS(int v) { // 첫 번쨰 : BFS(1)
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1; // ch[1] = 1
        dis[v] = 0; // dis[1] = 0

        queue.offer(v); //queue = 1
        while (!queue.isEmpty()) { // 비어있지않으면 true
            int currentVertex = queue.poll(); // cv(현재의 정점) = 1 , queue.poll()은 대기열 헤드에서 꺼낸다.

            //graph.get(currentVertex) 즉, 현재의 정점과 연결된 것들을 꺼내서 확인
            //인접리스트들을 탐색한다.
            //graph.get(1)에 3, 4
            for (int nextVertex : graph.get(currentVertex)) { // int nv  : graph.get(1) = 3, 4 가 존재함.

                                           // int nextVertex  : 3, 4
                if(ch[nextVertex] == 0 ){ // ch[3] == 0 ? true
                                          // ch[4] == 0? ture

                                  // 이유 : ch[]는 현재 다 0으로 초기화 되어있다.
                                  // ch[] = [1,0,0,0,0,0,0]

                    ch[nextVertex] = 1;  // ch[] = [1,0,0,1,1,0,0];
                    queue.offer(nextVertex); // queue.offer(3)  , queue = 3 들어가고
                    dis[nextVertex] = dis[currentVertex] + 1; // dis[3] = dis[1] + 1;
                                                              // dis[4] = dis[1] + 1;
                                           // dis[] = [0, 0, 0, 1, 1, 0, 0]
                                           //          0  1  2  3  4  5  6

                }
            }
        }
    }

    public static void main(String[] args) {
        그래프_최단거리14 T = new 그래프_최단거리14();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        ch = new int[n + 1]; // n+ 1의 이유는 : 1이라는 인덱스부터 사용하면 길이가 하나 더 필요
        dis = new int[n + 1]; // n+ 1의 이유는 : 1이라는 인덱스부터 사용하면 길이가 하나 더 필요


        //graph = [  ] ArrayList이다, ArrayList안에 ArrayLsit를 만들어 줄려면 객체생성을 통해서 만들어준다.
        //몇 번을 회전? n번까지 n=6   0,1,2,3,4,5,6  총 : 7번
        for (int i = 0; i <= n; i++) { // 7번 회전
            graph.add(new ArrayList<Integer>()); //new ArrayList<Intger>() 추가
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b); // [ [], [3,4], [1,5],  [4], [5,6], [],  [2,5] ]
                                 //   0     1     2       3    4     5,   6
                                 // 1에 인접한 정점은 3, 4
                                 // 2에 인접한 정점은 1, 5
                                 // 3에 인접한 정점은 4
                                 // 4에 인접한 정점은 5, 6
                                 // 5에 인접한 정점은 []
                                 // 6에 인접한 정점은 2, 5
        }

        T.BFS(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]); //  i = 2, 3 ,4, 5, 6   총 5번 회전
                                                    //  dis[i] :  dis[2], dis[3], dis[4], dis[5], dis[6]

                                                    // 2 : dis[2]
                                                    // 3 : dis[3]
                                                    // 4 : dis[4]
                                                    // 5 : dis[5]
                                                    // 6 : dis[6]
        }

    }
}
