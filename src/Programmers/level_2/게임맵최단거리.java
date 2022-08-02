package Programmers.level_2;
/*
    Lv2. 게임 맵 최단거리

    -문제
    https://school.programmers.co.kr/learn/courses/30/lessons/1844
    너무 길어서 링크 참고.
    대충 설명하자고 하면 5 X 5 의 행렬로 지도맵이 주어지고 출발지점은 (1,1), 도착지점은 (5,5)이다.

    -제한사항
        -maps는 n x m 크기의 게임 맵의 상태가 들어있는 2차원 배열로, n과 m은 각각 1 이상 100 이하의 자연수입니다.
        -n과 m은 서로 같을 수도, 다를 수도 있지만, n과 m이 모두 1인 경우는 입력으로 주어지지 않습니다.
        -maps는 0과 1로만 이루어져 있으며, 0은 벽이 있는 자리, 1은 벽이 없는 자리를 나타냅니다.
        -처음에 캐릭터는 게임 맵의 좌측 상단인 (1, 1) 위치에 있으며, 상대방 진영은 게임 맵의 우측 하단인 (n, m) 위치에 있습니다.

    입출력 예
    maps	                                                            answer
    [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]	    11
    [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]	    -1
 */

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;


class Pointer{
    int x ;
    int y ;

    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;

    }
}

public class 게임맵최단거리 {
    static boolean[][] dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        dis = new boolean[n][m];

        Queue<Pointer> Q = new LinkedList<>();
        Q.offer(new Pointer(n-1, m-1));
        dis[n - 1][m - 1] = true;


        while (!Q.isEmpty()) {
            Pointer tmp = Q.poll();

            if (tmp.x == 0 && tmp.y == 0) {
                return maps[tmp.x][tmp.y];
            }

            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && !dis[nx][ny]) {
                    Q.offer(new Pointer(nx,ny));
                    dis[nx][ny] = true;
                    maps[nx][ny] = maps[tmp.x][tmp.y] + 1;
                }
            }
        }
        return answer;
        }

    public static void BFS(int x, int y, int[][] maps) {

        Queue<Pointer> Q = new LinkedList<>();

        maps[x][y] = 0; //출발점 체크

        while (!Q.isEmpty()) {
            Pointer tmp = Q.poll();


            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx >= 0 && nx < maps.length && ny >= 0 && ny <maps[0].length && maps[nx][ny] == 1) {
                    maps[nx][ny] = 0;
                    Q.offer(new Pointer(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y];
                }
            }
        }
    }

    public static void main(String[] args) {
        게임맵최단거리 T = new 게임맵최단거리();
        int[][] maps ={{1,0,1,1,1}
                      ,{1,0,1,0,1}
                      ,{1,0,1,1,1}
                      ,{1,1,1,0,1}
                      ,{0,0,0,0,1}};
        System.out.println(T.solution(maps));
    }
}
