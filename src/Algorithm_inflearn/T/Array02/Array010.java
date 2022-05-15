package Algorithm_inflearn.T.Array02;

/**
 * 10. 봉우리
 */

import java.util.Scanner;

public class Array010 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};


    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true; // 봉우리인지 판별해주는 변수 
                for (int k = 0; k < 4; k++) { // k 가 4까지인 이유는 방향이 4개이기 때문이다.
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag){ //flag가 true 이면 answer에 갯수를 늘려준다.
                    answer++;
                }
            }
        }
        return answer ;
    }

    public static void main(String[] args) {
        Array010 T = new Array010();
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
