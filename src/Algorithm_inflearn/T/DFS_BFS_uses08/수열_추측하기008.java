package Algorithm_inflearn.T.DFS_BFS_uses08;
/**
 * 8. 수열 추측하기
 */

import java.util.Scanner;

public class 수열_추측하기008 {
    static int[] b,p, ch; // b[]: 조합 값들 입력
                          // p[]: 순열을 저장
                          // ch[] : 체크를 하면서 순서가 있게하기위해서 사용
    static int n,f;   //n :
                      //f : final number 를 저장
    boolean flag = false; // 답을 찾으면 재귀를 멈추게하기 위해서
    int[][] dy = new int[35][35]; // 조합수를 메모이제이션에 쓰기 위해서

    //combi : 조합수 메모이제이션
   private int combi(int n, int r) {
        if (dy[n][r]> 0) return dy[n][r];
        if (n==r || r==0) return 1;
        else return dy[n][r] =combi(n-1, r-1) + combi(n-1, r);
    }

    private void DFS(int L, int sum) { // DFS(L, 16) <이 매개변수로 넘어온다.
      if (flag) return;
      if (L == n){
          if (sum == f) {
              for (int x : p) System.out.print(x + " ");
              flag = true;
          }

      }else{
          for (int i = 1; i <= n; i++) { // 여기서 i는 순열을 만드는 숫자  cf. 인덱스번호 아
              if (ch[i]==0) { // 사용했나? 안했나 ? 체크한다.
                  ch[i] = 1;
                  p[L] = i;
                  DFS(L+1, sum + (p[L]*b[L]));
                  ch[i]=0; //체크를 풀어준다.
              }
          }
      }
    }

    public static void main(String[] args) {
        수열_추측하기008 T = new 수열_추측하기008();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // input : 4
        f = sc.nextInt(); // input : 16
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1]; // for문안에서 1부터 돌아야하기 때문에 n + 1 한 것
        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n-1, i); // 3Ci(0,1,2,3)
        }
        T.DFS(0,0);
    }
}
