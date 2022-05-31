package Algorithm_inflearn.Me.DFS_BFS_uses;

import java.util.Scanner;

/**
 * 3.최대 점수 구하기
 *
 *  부분집합 스타일의 문제
 *
 */
public class 최대점수_구하기3 {
    static int n ;
    static int m ;
    static int answer =Integer.MIN_VALUE;
    public int DFS(int L,int sum, int time, int[] ps, int[] pt){

        if(L==n){
            answer = Math.max(answer, sum);
        }else{
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt); //문제를 풀었을 때(가지를 친다.)
            DFS(L+1, sum, time,ps,pt); // 문제를 못 풀었을 때  (가지를 안친다.)
        }
        return answer;
    }


    public static void main(String[] args){
        최대점수_구하기3 T = new 최대점수_구하기3();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 문제의 개수
        m = sc.nextInt(); // 제한시간
        int sum[] = new int[n]; //총 점수
        int time[] = new int[m]; // 총 걸리는 시간
        for(int i = 0; i<n; i++){
            sum[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        T.DFS(0,0,0,sum,time);
        System.out.println(answer);

    }
}
