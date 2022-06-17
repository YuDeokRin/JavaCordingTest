package BaekJoon.Backtracking;
/*
15650. N과 M(2)

문제
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

-1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
-고른 수열은 오름차순이어야 한다.

예제입력)
3 1

예제출력)
1
2
3

 */
import java.util.*;

class N과M_2{
    static int[] combi;
    static int n, m;
    public void DFS(int L, int s){
        if(L==m){ // 노드가 안나올 때까지 (끝까지 즉, 완성)
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for(int i=s; i<=n; i++){ // s = 1 부터 시작
                combi[L]=i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args){
        N과M_2 T = new N과M_2();
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        combi=new int[m];
        T.DFS(0, 1);
    }
}
