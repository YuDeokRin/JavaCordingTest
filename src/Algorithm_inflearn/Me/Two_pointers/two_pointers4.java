package Algorithm_inflearn.Me.Two_pointers;

import java.util.Scanner;

/**
 * 4. 연속 부분 수열 (복합적문제)
 */
public class two_pointers4 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum==m){
                answer++;
            }
            while(sum >= m){
                sum-=arr[lt++];;
                if (sum==m) {
                    answer++;
                }
            }

        }
        return answer ;

    }

    public static void main(String[] args) {
        two_pointers4 T = new two_pointers4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,m,arr));


    }

}
