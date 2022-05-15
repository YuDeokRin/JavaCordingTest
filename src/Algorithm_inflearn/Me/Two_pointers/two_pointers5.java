package Algorithm_inflearn.Me.Two_pointers;

import java.util.Scanner;

/**
 * 5. 연속된 자연수의 합
 */
public class two_pointers5 {

    public int solution(int n) {
        int answer =0;
        int lt = 0;
        int sum = 0;
        int m =n/2+1; //연속된 자연수가 몇 가지 필요한지 구하는 변수
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]= i+ 1; //1  ~ 8
        }

        for (int rt = 0; rt < m; rt++) {
            sum+= arr[rt]; // 1 3 6 10 15 21 28 36 0

            if (sum==n){
                answer++;
            }
            while (sum > n) {
                sum= sum - arr[lt++];
                if (sum==n){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        two_pointers5 T= new two_pointers5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));

    }
}
