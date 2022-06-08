package Algorithm_inflearn.T.DFS_BFS_uses08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6.순열 구하기
 *
 * 주의해야할 점 : 순열은 순서가 존재한다. 순서를 체크할 수 있는 배열을 만들어줘야 한다.
 *
 */
/*

문제 : 10이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합 니다.

입력설명 : 첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다. 두 번째 줄에 N개의 자연수가 오름차순으로 주어집니다.


출력 설명 :  첫 번째 줄에 결과를 출력합니다. 출력순서는 사전순으로 오름차순으로 출력합니다.

입력예제)
3 2
3 6 9

출력예제)
3 6
3 9
6 3
6 9
9 3
9 6

 */

public class 순열구하기006 {
    static int n, m;
    static int[] arr, pm, ch;


    public void DFS(int L) {
        if (L==m) { //level이 m 이면 순열하나 완성
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        }else {
            for (int i = 0; i < n; i++) { // i는 뻗는 가지의 수
                if(ch[i]==0){ // 처음은 다 0으로 초기화 되어있다
                    ch[i] = 1; // 0이 아니기때문에 우선 체크를 해준다. 그래야지 똑같은 숫자를 탐색하지 않는다.
                    pm[L] = arr[i];
                    DFS(L+1); //다음 인덱스로 넘어가는 것
                    ch[i] = 0; // 다시 백할 때 0으로 만들어준다.
                }
            }
        }
    }

    public static void main(String[] args) {
        순열구하기006 T = new 순열구하기006();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt(); // arr = [3, 6, 9]
        ch = new int[n]; // 탐색했던 곳을 체크해주는 배열 생성
        pm = new int[m]; // 순열이 들어가는 배열 생성
        T.DFS(0);
    }
}
