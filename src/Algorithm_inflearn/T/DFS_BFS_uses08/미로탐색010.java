package Algorithm_inflearn.T.DFS_BFS_uses08;
/**
 * 10. 미로탐색(DFS)
 * 완전탐색
 *
 * 문제 :  7*7 미로를 탈출하는 경로의 가지수를 구하는 프로그램
 *       조건:  출발은 (1,1) , 도착은 (7,7),  1은 벽, 0은 통로 격자판의 움직임은 상하좌우만 가능
 *
 */

import java.util.Scanner;

public class 미로탐색010 {
    static int[][] board ;

    //dx = -1, dy= 0  이면 12시 방향(상)
    //dx = 0, dy= 1  이면 3시 방향 (우)
    //dx = 1, dy= 0  이면 6시 방향 (하)
    //dx = 0, dy= -1  이면 9시 방향 (좌)

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;



    //좌표에서 상하 좌우 ?

    //탐색로직
    public int DFS(int x , int y) {
        //종착점 도착한 경
        if (x == 7 && y == 7) answer++;
        else{
            //상(12시 방향), 우(3시 방향), 하(6시 방향), 좌(9시 방향) 갈 수있는지 확인하고 뻗어나가는 로직
            for(int i = 0; i <4; i++){ // i < 4 : 4 전까지 4가지 방향
                int nx = x + dx[i]; // 다음지점(nx) = 현재지점(x) + 행 번호[인덱스로 ]
                int ny = y + dy[i]; // 다음지점(ny) = 현재지점(y) + 열 번호[]

                //경계선 밖인지 안인지 확인하고 borad에서 다음 좌표로 갈 때 0(통로)인지 1(벽)인지 확인하고 다음 좌표로 이동하는 로직
               if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0){ // 1보다는 크고 7보단 작아야지 경계선 안이라는 것을 확인 , board에서 다음 위치가 0이여야 간다.
                    board[nx][ny] = 1; // 다음 좌표로 갔기때문에 1로 체크
                    DFS(nx, ny); //다음좌표로 넘어간다.
                    board[nx][ny] = 0; // 뒤로 빽 하면서 벽을 통로로 바꿔준다.
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        미로탐색010 T = new 미로탐색010();
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        for(int i = 1 ;i<=7; i++){
            for(int j = 1; j<=7; j++){
                board[i][j]= sc.nextInt();
            }
        }
        board[1][1] = 1;
        T.DFS(1,1);
        System.out.println(answer);
    }
}
