package Algorithm_inflearn.T.DFS_BFS_uses08;

import java.util.Scanner;

/*
    13. 섬나라 아일랜드(DFS)

    문제
    N*N의 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다.
    각 섬은 1로 표시되어 상하좌우와 대각선으로 연결되어 있으며, 0은 바다입니다.
    섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.

    입력
    첫 번째 줄에 자연수 N(3<=N<=20)이 주어집니다.
    두 번째 줄부터 격자판 정보가 주어진다.


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
public class 섬나라_아일랜드012 {
    static int n;
    static int answer = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; // 시계 8방향
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};


    public void DFS(int x, int y, int[][] board) {

        //8곳의 방향을 탐색하는 로직
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && nx<n && ny >= 0 && ny<n && board[nx][ny]==1){
                board[nx][ny] = 0; // 섬으로 체크한것은 0으로 바꿔준다.
                DFS(nx, ny, board);
            }
        }
    }
    public void solution(int[][] board) {
        //
        for(int i =0; i<n; i++){
            for (int j = 0; j < n; j++) {
                //탐색을 하던중 1을 만났을 경우
                if(board[i][j] == 1){
                    answer++; // 섬의 개수를 증가
                    board[i][j] = 0; // 출발점을 0으로 바꿔놓고 DFS로 넘긴다.
                    DFS(i, j, board); // i, j는 1이 탐색된 위치
                }
            }
        }
    }

    public static void main(String[] args) {
        섬나라_아일랜드012 T = new 섬나라_아일랜드012();
        Scanner in = new Scanner(System.in);
        n = in.nextInt(); // 격자의 크
        int[][] arr = new int[n][n]; // 격자판 배열 객체

        //격자판 입력
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        T.solution(arr);
        System.out.println(answer);
    }
}
