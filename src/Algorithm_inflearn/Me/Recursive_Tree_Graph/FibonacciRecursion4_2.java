package Algorithm_inflearn.Me.Recursive_Tree_Graph;

import java.util.Scanner;

public class FibonacciRecursion4_2 {
    public int DFS(int n) {
        if(n == 1) return 1;
        else if(n ==2 ) return 1;
        else return DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args){
        FibonacciRecursion4_2 T = new FibonacciRecursion4_2();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(T.DFS(i) + " ");
        }
    }
}
