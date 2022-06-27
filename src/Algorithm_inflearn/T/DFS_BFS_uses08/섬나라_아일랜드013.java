package Algorithm_inflearn.T.DFS_BFS_uses08;
/*
    13. 섬나라 아일랜드(BFS)

    -문제
   N*N의 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다.
   각 섬은 1로 표시되어 상하좌우와 대각선으로 연결되어 있으며, 0은 바다입니다.
   섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.

   입력)
   첫 번째 줄에 자연수 N(3<=N<=20)이 주어집니다.
   두 번째 줄부터 격자판 정보가 주어진다.

   출력)
   첫 번째 줄에 섬의 개수를 출력한다.


   입력 예제)
   7
    1 1 0 0 0 1 0
    0 1 1 0 1 1 0
    0 1 0 0 0 0 0
    0 0 0 1 0 1 1
    1 1 0 1 1 0 0
    1 0 0 0 1 0 0
    1 0 1 0 1 0 0

   출력 예제)
   5




 */
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
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; // 8방향(12시 방향(-1), 1시 방향(-1), 3시 방향(0), 4시 방향(1), 6시 방향(1), 8시 방향(1), 9시 방향(0), 10시 방향(-1))
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1}; // 8방향(12시 방향(0), 1시 방향(1), 3시 방향(1), 4시 방향(1), 6시 방향(0), 8시 방향(-1), 9시 방향(-1), 10시 방향(-1))


    private void BFS(int x, int y, int board[][]) {  // 첫번째 위치를 매개변수로 받는다.
    Queue<Point13> Q = new LinkedList<>();
        Q.add(new Point13(x,y)); // 첫 번째 위치를 Q에 넣는다    큐의 상황 : Ponint(0,0)
        while (!Q.isEmpty()) { // 비어있지 않으면 true , 비어있으면 false
            Point13 pos = Q.poll(); // Point(0,0)을 꺼내서 확인 -> 무슨 확인 : 8방향 탐색 , 육지 인지 확인
            for (int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i]; //다음좌표 = 현재좌표(pos.x) + dx[i]
                int ny = pos.y + dy[i]; //다음좌표 =  현재좌표(pos.y) + dy[i]
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) { // 다음 좌표의 경계값 체크, 다음 좌표가 1(육지)인가?
                    board[nx][ny] = 0; //[nx][ny] -> 12시 x , 1시 x, 3시 o , 3시의 좌표는[0][1]
                    Q.add(new Point13(nx,ny)); // point13[0][1]을 Q에 추가
                }
            }
        }
    }
    //board는

    public void solution(int[][] board) {
        for (int i = 0; i < n; i++) { // 0 부터 7까지
            for (int j = 0; j < n; j++) { // 0부터 7까지
                if(board[i][j] == 1){ // board[0 ~ 7][ 0 ~ 7] == 1 이면, 육지를 만났다는 것.
                    answer++; // 섬 갯수 하나 올려준다.
                    board[i][j] = 0; // 출발점은 0 바다로 만들어 놓기 그래야지 탐색할 때 다시 육지라고 체크를 안한다 .
                    BFS(i, j, board); // 첫번째 위치를 탐색하는 함수로 넘겨준다.
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
                arr[i][j] = in.nextInt(); // 섬나라 아일랜드 맵을 입력으로 만들어 준다.
            }
        }
        T.solution(arr); //arr 매개변수로 solution으로 넘겨준다. 앞에서 만들어준 arr은 섬나라 아일랜드를 넘겨준다.
        System.out.println(answer);
    }
}
