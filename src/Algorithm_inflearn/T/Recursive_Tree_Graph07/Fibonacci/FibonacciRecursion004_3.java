package Algorithm_inflearn.T.Recursive_Tree_Graph07.Fibonacci;

/**
 * 4. 조금 느린 피보나치 수열
 */
public class FibonacciRecursion004_3 {
    static int[] fibo;

    public int DFS(int n){
        if (n==1) return fibo[n] = 1;
        else if (n==2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2 ) + DFS(n-1);
    }

    public static void main(String[] args) {
        FibonacciRecursion004_3 T = new FibonacciRecursion004_3();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.println(fibo[i] + " ");
        }
    }
}
