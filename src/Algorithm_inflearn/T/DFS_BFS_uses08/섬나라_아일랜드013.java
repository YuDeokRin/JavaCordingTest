package Algorithm_inflearn.T.DFS_BFS_uses08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//BFS이기때문에 Q에다가 좌표를 넣야하기 때문에 x, y 객체를 만들어 준다.
class Point13{
    int x;
    int y;

    public Point13(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class 섬나라_아일랜드013 {
    static int n , answer;
    static int[][] board;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    Queue<Point13> Q = new LinkedList<>();


    private void BFS(int x, int y, int board[][]) {
        Q.add(new Point13(x,y));
        while (!Q.isEmpty()) {
            Point13 pos = Q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    Q.add(new Point13(nx,ny));
                }
            }
        }
    }

    public void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1){
                    answer++;
                    board[i][j] = 0; // 출발점은 0 바다로 만들어 놓기
                    BFS(i, j, board);
                }

            }
        }
    }

    public static void main(String[] args) {
        섬나라_아일랜드013 T = new 섬나라_아일랜드013();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        T.solution(arr);
        System.out.println(answer);
    }
}
