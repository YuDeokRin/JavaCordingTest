package Algorithm_inflearn.T.Recursive_Tree_Graph07.Fibonacci;
/**
 * 4.피보나치 수열
 * 전체 다 출력 구하기
 */

import java.util.Scanner;

public class FibonacciRecursion004_2 {

    public int DFS(int n) {
        if (n == 1) return 1;
        else if (n==2) return 1;
        else return DFS(n-2) + (n-1);
    }

    public static void main(String[] args) {
        FibonacciRecursion004_2 T = new FibonacciRecursion004_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(T.DFS(i) + " ");
        }

    }
}
