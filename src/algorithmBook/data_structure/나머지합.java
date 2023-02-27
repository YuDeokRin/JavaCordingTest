package algorithmBook.data_structure;

import java.util.Scanner;

public class 나머지합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] S = new long[N];
        long[] C = new long[M];

        long answer = 0;

        S[0] = sc.nextInt();
        for (int i = 1; i < N; i++) { // 수열 합 배열 만들기
            S[i] = S[i - 1] + sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);

            if(remainder == 0 )answer++;

            C[remainder]++;
        }

        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer = answer + (C[i] * (C[i] - 1) / 2);
            }
        }

        System.out.println(answer);
    }

    /*
    import java.util.*;
    public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }

    // 부분합 배열 만들기
    int[] s = new int[n+1];
    for (int i = 1; i <= n; i++) {
        s[i] = (s[i-1] + a[i-1]) % m;
    }

    // 나머지가 같은 부분합 쌍의 개수 구하기
    long[] count = new long[m];
    for (int i = 0; i <= n; i++) {
        count[s[i]]++;
    }

    long ans = 0;
    for (long c : count) {
        ans += c * (c-1) / 2;
    }

    System.out.println(ans);
}
}

     */
}
