package Algorithm_inflearn.T.DFS_BFS_uses08;
/**
 * 5. 동전교환(DFS를 사용하여 구하기)
 *
 * 5 5 5 동전 3개로 거슬러 줄 수 있다.
 *
 * 중복 순열과 비슷하다.
 */

import java.util.*;
class 동전교환005{
    static int n, m, answer=Integer.MAX_VALUE;
    // L은 사용된 동전의 개수
    // sum: L에게의 개수에서  동전의 합
    public void DFS(int L, int sum, Integer[] arr){
        if(sum>m) return;
        if(L>=answer) return;
        if(sum==m){
            answer=Math.min(answer, L);
        }
        else{
            for(int i=0; i<n; i++){
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }
    public static void main(String[] args){
        동전교환005 T = new 동전교환005();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt(); //동전 단위의 종류의 수
        Integer[] arr=new Integer[n]; // 동전 단위 배열 만들기
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        Arrays.sort(arr, Collections.reverseOrder()); //비어있는 배열에 값 입력[1, 3, 5]
        m=kb.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}

