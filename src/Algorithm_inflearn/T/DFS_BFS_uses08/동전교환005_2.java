package Algorithm_inflearn.T.DFS_BFS_uses08;

import java.util.Scanner;

public class 동전교환005_2 {
    static int n, m, answer =Integer.MAX_VALUE;
    public void DFS(int L, int sum, int[] arr){
        if(sum>m) return;
        if(sum==m){ //거슬러 주는 금액을 만족함
            answer = Math.min(answer, L);
        
        }else{
            for (int i = 0; i < n; i++) { //i는 0번 인덱스부터 n번까지
                DFS(L + 1, sum + arr[i], arr);

            }
            
        }
    }
    public static void main(String[] args) {
        동전교환005_2 T = new 동전교환005_2();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //동전 단위의 종류의 수
        int[] arr = new int[n]; // 동전 단위 배열 만들기
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt(); // 만든 배열에 값 넣어주기 [1,3,5]
        m = sc.nextInt(); //거슬러줄 금액 - 15
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
