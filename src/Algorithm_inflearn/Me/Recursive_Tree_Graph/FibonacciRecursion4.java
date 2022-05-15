package Algorithm_inflearn.Me.Recursive_Tree_Graph;

import java.util.Scanner;

/**
 * 4. 피보나치 재귀(메모이제이션)
 *
 *  step 1. 피보나치 수열의 순서의 값을 구하는 방법.
 *  예) 1 1 2 3 5 8 13 ...  -> 4번 째 값 : 3 , 7번째 값 : 13
 */
public class FibonacciRecursion4 {
    public int DFS(int n) {
        if(n==1) return 1;
        else if (n==2) return 1;
        else return DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        FibonacciRecursion4 T = new FibonacciRecursion4();
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.DFS(n));
    }
}
