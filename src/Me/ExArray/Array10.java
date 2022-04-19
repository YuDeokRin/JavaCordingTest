package Me.ExArray;

import java.util.Scanner;

/**
 * 10.봉우리
 */

public class Array10 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};


    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k]; // 행값
                    int ny = j + dy[k]; // 열값
                    if (nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]){ //봉우리 판별
                        flag =false;
                        break; //모든 방향을 볼 필요가없어서 break를 한다.
                    }
                }
                if (flag){
                    answer++;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Array10 T = new Array10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
