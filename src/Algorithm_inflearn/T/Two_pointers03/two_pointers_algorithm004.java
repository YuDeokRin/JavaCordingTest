package Algorithm_inflearn.T.Two_pointers03;

import java.util.Scanner;

public class two_pointers_algorithm004 {
    public int soultion(int n, int m, int[] arr) {
        int answer = 0, sum =0, lt=0;
        for (int rt = 0; rt < n; rt++) {
            sum+=arr[rt];

            if (sum == m) answer++;

            while (sum >= m) {
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        two_pointers_algorithm004 T = new two_pointers_algorithm004();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(T.soultion(n, m, arr));
    }
}
