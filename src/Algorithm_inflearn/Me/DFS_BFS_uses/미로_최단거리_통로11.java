package Algorithm_inflearn.Me.DFS_BFS_uses;
/*
11. 미로의 최단거리 통로(BFS)

- 문제
 7 by 7 격자판 미로를 탈출하는 최단경로의 길이를 출력하는 프로그램을 만들어라
 경로의 길이는 출발점에서 도착점까지 가는데 이동한 횟수를 의마한다.
 출발점 (1,1)좌표이고,  탈출 좌표(7,7)이다.
 격자판의 1은 벽이고, 0은 통로이다.

 움직임은 상하좌우 각 한번씩 이동할 수 있다.

 입력
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0

출력  : 12  (최단 경로의 길이)



 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//좌표 객체 생성 (x,y)
class Point2{
    int x ;
    int y ;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class 미로_최단거리_통로11 {
    static int board[][]; // 7*7 미로맵(격자판)
    static int dis[][]; // 7*7로 된 거리 저장하는 배열

    // 12시방향(-1, 0), 3시 방향(0,1), 6시 방향(1,0), 9시 방향(0,-1)
    static int dx[] = {-1,0,1,0};
    static int dy[] = {0,1,0,-1};

    public void BFS(int x, int y) {
        Queue<Point2> Q = new LinkedList<>(); // Queue 생성 : Point2 형식으로 넣어준다. 예) (x,y)
        Q.offer(new Point2(x, y)); // Point2 객체를 생성해서 넣어준다.
        board[x][y] = 1; // 출발점을 체크해준다. 왜냐하면 내 지점이 0으로 되면 안되기 때문에
        while(!Q.isEmpty()){ // Q가 완전히 없을 때까지 반복문을 실행하자. -> Empty가 아닐 때까지 돌리자.
            Point2 tmp = Q.poll(); // Point2 타입으로 변수를 만들어서 Q.poll() 꺼낸 값을 넣는다.

            //상, 하, 좌, 우 탐색한다.
            for(int i = 0 ; i<4; i++){

                //nx, ny를 통해서 다음 좌표지점을 찾는다.
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                //다음 좌표지점을 갈수 있는 곳인지 확인하는 로직 (확인 : 경계값 체크, 다음 칸이 0인지(가능) 1인지(불가능) 체크)
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny]==0){
                    board[nx][ny] = 1; //체크해준다. 다음 위치이기 때문에
                    Q.offer(new Point2(nx, ny)); // 새로운 좌표를 넣어준다.
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }


    public static void main(String[] args) {
        미로_최단거리_통로11 T = new 미로_최단거리_통로11();
        Scanner in = new Scanner(System.in);
        board = new int[8][8]; // 1~ 7까지해야하기때문에 8로 설정
        dis = new int[8][8]; // board와 같은 크기의 격자판을 설정
        for (int i = 1; i <=7; i++) {
            for (int j= 1; j <= 7; j++) {
                board[i][j] = in.nextInt(); // 미로맵에 들어갈 값들을 넣어준다.
            }
        }
        T.BFS(1, 1); // (1,1) 시작 지점

        // 조건 : 도착지점에서 멈출려고 마지막 조건을 걸어준다
        //       dis[7][7] == 0 -> 의미 : (7,7)에 못갔다는 뜻
        if (dis[7][7] == 0 ) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
