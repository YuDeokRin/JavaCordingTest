package Algorithm_inflearn.T.Recursive_Tree_Graph07.Fibonacci;

/**
 * 매우 빠른 피보나치 수열
 * 단, 재귀함수로 돌렸을 때 케이스 중에서만..
 */
public class FibonacciRecursion004_4 {
    static int fibo[];

    public int DFS(int n){
        if (n == 1 )return fibo[n] = 1 ;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2)+ DFS(n - 1);
    }
    public static void main(String[] args) {
        FibonacciRecursion004_4 T = new FibonacciRecursion004_4();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 2; i < n; i++) {
            System.out.println(fibo[i] + " ");
        }
        System.out.println(T.DFS(n));
    }
}
