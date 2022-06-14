package Algorithm_inflearn.Me.DFS_BFS_uses;
/*
10. 미로탐색(DFS)

알고리즘 분류 : DFS(깊이 우선 탐색), 재귀함수
문제 :  7*7 미로를 탈출하는 경로의 가지수를 구하는 프로그램
      조건:  출발은 (1,1) , 도착은 (7,7),  1은 벽, 0은 통로 격자판의 움직임은 상하좌우만 가능

 */

import java.util.Scanner;

public class 미로탐색10 {
    static int board[][]; // 미로맵
    static int[] dx = {-1, 0, 1, 0}; // dx는 행
    static int[] dy = {0, 1, 0, -1}; // dy는 열
    static int answer = 0; //탈출방법의 수

    public void DFS(int x, int y){
        if(x == 7 && y == 7) answer++;  // x = 7, y = 7 은 도착지점이다.  도착지점 찍으면 answer++
        else{
            for(int i =0; i<4; i++){ // 위치를 상하좌우 탐색하여 이동하는 for문 (상,우,하,좌)
                int nx = x + dx[i]; // nx = 1 + dx[0]  -> nx = 1 + -1; -> 0
                int ny = y + dy[i]; // ny = 1 + dy[0]  -> ny = 1 + 0; -> 1

                //위의 조건이 참이면 이동한다.
                if(nx >= 1 && nx<=7 && ny >= 1 && ny <=7 && board[nx][ny] == 0) { //nx가 1과 같거나 커야한다. 나머지도 마찬가지로
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0 ;
                }
            }
        }
    }
    public static void main(String[] args){
        미로탐색10 T = new 미로탐색10(); // 클래스 Main의 메소드를 사용하기 위해서 객체를 생성
        Scanner in =new Scanner(System.in); // 미로를 만들려면 입력이 필요하다...입력할 수 있는 객체 Scanner 생성
        board = new int[8][8]; // 배열이 8까지 하는 이유는 시작은 1부터 하기때문이다.
        for(int i = 1; i <= 7; i++){ //i는 1부터 7가지
            for(int j = 1; j <= 7; j++){ // (1,1) (1,2) ... (2,1) (2,2) ...
                board[i][j] = in.nextInt(); //이차원 배열로 7x7을 행렬을 만들어준다.
            }
        }
        board[1][1] = 1; // 출발 좌표는 1로
        T.DFS(1,1);//출발하는 곳
        System.out.println(answer); //탈출 방법의 수
    }
}