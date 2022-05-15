package Algorithm_inflearn.T.Two_pointers03;

import java.util.Scanner;

public class two_pointers_algorithm006 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt=0, lt=0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt]==0){
                cnt++;
            }
            while(cnt>k){
                if (arr[lt]==0){
                cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);

        }

        return answer;
    }

    public static void main(String[] args) {
        two_pointers_algorithm006 T = new two_pointers_algorithm006();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }
        System.out.println(T.solution(n,k,arr));

    }
}
