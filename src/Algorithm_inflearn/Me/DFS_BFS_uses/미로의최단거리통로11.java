package Algorithm_inflearn.Me.DFS_BFS_uses;

/*
11. 미로의 최단거리 통로 (BFS)

-문제
    7*7 격자판 미로를 탈출하는 최단경로의 길이를 출력하는 프로그램을 작성하세요.
    경로의 길이는 출발점에서 도착점까지 가는데 이동한 횟수를 의미한다.
    출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 도로이다.

입력값  - 미로의 맵
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0

출력 : 12

 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point{
    public int x,y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class 미로의최단거리통로11 {
    static int board[][]; // 미로 맵
    static int dis[][];// 경로의 길이를 나타내는 미로맵
    static int dx[] = {-1, 0,1,0};
    static int dy[] = {0, 1, 0, -1};
    static int answer=0;
    public void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        board[x][y] = 1; // 출발점지점 체크
        while(!Q.isEmpty()){ // Q안에 값이 비어있지 않을 때 ->참
            Point tmp = Q.poll(); // 값을 꺼낸다. 꺼낸값으로 방향을 어디로 갈지 밑에서
                for(int i = 0; i<4; i++){ // 방향 - 상 우 하 좌
                    int nx = tmp.x + dx[i]; //다음 위치값 = 꺼낸값(현재위치) + dx[i]
                    int ny = tmp.y + dy[i];
                    // 가려고하는 지점의 겅계선 검사와 통로인지 확인 : 경계선을 넘었는지 안넘었는지 확인 하고 board가 ==0 인지 확인(통로인지 벽인지 확인)
                    if(nx >=1 && nx <= 7 && ny >=1 && ny <= 7 && board[nx][ny] == 0){
                        board[nx][ny] = 1; // 그 지점으로 가면 체크를한다.
                        Q.offer(new Point(nx, ny)); //
                        dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                    }
                }

        }

    }

    public static void main(String[] args){
        미로의최단거리통로11 T = new 미로의최단거리통로11();
        Scanner in = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for(int i = 1; i<= 7; i++){
            for(int j =1; j<=7; j++){
                board[i][j] = in.nextInt();
            }
        }
        T.BFS(1,1); //출발점
        if(dis[7][7] == 0) System.out.println(-1); // (7,7)에 도착하지 못하면 -1 출력
        else System.out.print(dis[7][7]); // (7,7)에 도착하면 끝
    }
}
