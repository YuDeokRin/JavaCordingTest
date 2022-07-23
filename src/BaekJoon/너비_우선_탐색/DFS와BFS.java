package BaekJoon.너비_우선_탐색;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
    1260. DFS와 BFS

    -문제
    그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
    단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다.
    정점 번호는 1번부터 N번까지이다.

    입력)
    첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다.
    다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
    어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

    출력)
    첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.

    입력 예제)
4 5 1
1 2
1 3
1 4
2 4
3 4

    출력 예제)
    1 2 4 3
    1 2 3 4
 */
public class DFS와BFS {
    static int N;
    static int M;
    static int V;
    static int[][] arr;
    static boolean[] ch;


    private void DFS(int V) {
        ch[V] = true;
        System.out.print(V + " ");

        if (V == arr.length) {
            return;
        }else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[V][i] == 1 && ch[i] == false) {
                    DFS(i);
                }
            }
        }
    }

    private void BFS(int V) {
        Queue<Integer> Q = new LinkedList<>();

        Q.add(V);
        ch[V] = true;
        System.out.print(V + " ");

        while(!Q.isEmpty()){
            int temp = Q.poll();
            for (int i = 1; i < arr.length; i++) {
                if (arr[temp][i] == 1 && ch[i] == false) {
                    Q.add(i);
                    ch[i] = true;
                    System.out.print(i + " ");
                }
            }
        }

    }

    public static void main(String[] args) {
        DFS와BFS T = new DFS와BFS();
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        V = in.nextInt();

        //인접행렬
        arr = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            int a = in.nextInt(); // 1 2 , 1 3 , 1 4, 2 4, 3 4
            int b = in.nextInt(); //
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        ch = new boolean[N + 1];
        T.DFS(1);

        System.out.println();

        ch = new boolean[N + 1];
        T.BFS(1);

    }
}
