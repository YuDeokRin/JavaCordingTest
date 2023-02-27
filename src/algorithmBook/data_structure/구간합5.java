package algorithmBook.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //데이터갯수  4
        int M = Integer.parseInt(st.nextToken()); //질의 개수 3


        int A[][] = new int[N+1][N+1]; // 4 X 4
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine()); //
            for (int j = 1; j <= N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken()); // 
            }
        }
        
        //D[i][j]의 값을 채우는 구간 합 공식
        int D[][] = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                //구간 합 구하기  공식 => D[i][j]  = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
                D[i][j]  = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            }
        }


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());


            // 구간 합 배열로 질의에 답변하기
            int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
