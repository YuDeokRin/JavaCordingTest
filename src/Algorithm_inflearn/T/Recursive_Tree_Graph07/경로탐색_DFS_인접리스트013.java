package Algorithm_inflearn.T.Recursive_Tree_Graph07;
/*

    경로 탐색(인접리스트)
    인접 리스트를 사용 할 때는 ? 정점의 수가 1000개 10000개 ... 엄청 많을 떄  인접행렬은 비효율적이기 때문에
    인접리스트를 사용해서 조금 더 나은 효율을 발생시킨다.

   | 1 |2 |3 |4 |5 |6  |
   --------------------
  1|   |  |  |  |  |   |
  2|   |  |  |  |  |   |
  3|   |  |  |  |  |   |
  4|   |  |  |  |  |   |
  5|   |  |  |  |  |   |
  6|   |  |  |  |  |   |

  인접행렬으로 연산 할 경우 : v(정점)에서 경로 탐색할 떄
                        1행은 1열, 2열, 3열, 4열, 5열, 6열 다 찾아서 6번을 찾는다. 똑같이
                        2행은 1열, 2열, 3열, 4열, 5열, 6열 다 찾아서 6번을 찾는다.
                        3행은 1열, 2열, 3열, 4열, 5열, 6열 다 찾아서 6번을 찾는다.
                        4행은 1열, 2열, 3열, 4열, 5열, 6열 다 찾아서 6번을 찾는다.
                        5행은 1열, 2열, 3열, 4열, 5열, 6열 다 찾아서 6번을 찾는다.
                        6행은 1열, 2열, 3열, 4열, 5열, 6열 다 찾아서 6번을 찾는다.
                        이렇게 찾는다.
  그런데 만약 정점의 수가 10000개 라면 ?
  10000 * 10000개를 연산한다.. 생각만해도 끔찍하다.  너무너무 비효율 적이다.

  그래서 효율적인 방법이 있다고 한다. 바로 오늘 배울 인접리스트이다.

  n = 5 라는 상황에 가정해서 인접리스트를 설명해보겠다.

  1. 1 ~ 5 까지 리스트 객체를 생성(ArrayList)

  2. n 번 정점에서 갈 수 있는 리스트를 넣어놓는다.
       1 ●-> 2 - 3 - 4
       2 ● - 1 - 3
       3 ● - 4
       4 ● - 2 - 5
       5 ● -
  이렇게 된다면 n번 정점에서 연결된 리스트만 탐색한다는 뜻.


    -문제
    방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프 로그램을 작성하세요.
    1번 정점에서 5번 정점으로 가는 가지 수는 ? 그림은 직접 그려보고해보기

    1 2 3 4 5
    1 2 5
    1 3 4 2 5
    1 3 4 5
    1 4 2 5
    1 4 5

    총 6 가지이다.

    -입력 설명
    첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연 결정보가 주어진다.

    -출력 설명
    총 가지수를 출력한다.

    -입력 예제
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5

    -출력 예제
    6

 */

import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색_DFS_인접리스트013 {

    static int n,m , answer= 0;
    static int[] ch ;
    static ArrayList<ArrayList<Integer>> graph;


    public void DFS(int v) {
        if(v == n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        경로탐색_DFS_인접리스트013 T = new 경로탐색_DFS_인접리스트013();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <=n; i++) { // 0,1,2,3,4,5
            graph.add(new ArrayList<Integer>());
        }

        ch= new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
