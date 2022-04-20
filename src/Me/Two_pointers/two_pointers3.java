package Me.Two_pointers;

import BaekJoon.Main;
/**
 * 3. 최대 매출(Sliding window)
 */
import java.util.Scanner;

public class two_pointers3 {
    public int solution(int n, int m, int[] arr) {
        int sum = 0;
        int answer = sum;
        for (int i = 0; i < n-m; i++) {
            sum = sum - arr[i] + arr[i+m];
            if(sum > answer){
                answer = sum;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        two_pointers3 T = new two_pointers3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
