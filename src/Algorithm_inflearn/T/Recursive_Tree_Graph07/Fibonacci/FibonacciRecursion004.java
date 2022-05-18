package Algorithm_inflearn.T.Recursive_Tree_Graph07.Fibonacci;
/**
 * 4. 피보나치 수열
 * 마지막 다 더해진 값 구하기
 */

import java.util.Scanner;

public class FibonacciRecursion004 {
    private int DFS(int n) {
        if (n == 1) return 1 ;
        else if ( n == 2 ) return 1;
        else return DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        FibonacciRecursion004 T = new FibonacciRecursion004();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.DFS(n));

    }
}
