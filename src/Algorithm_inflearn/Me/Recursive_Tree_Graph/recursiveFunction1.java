package Algorithm_inflearn.Me.Recursive_Tree_Graph;

/**
 * 1. 재귀함수(스택프레임)
 */
public class recursiveFunction1 {
    public void DFS(int n) {
        if (n==0) return ;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        recursiveFunction1 T = new recursiveFunction1();
        T.DFS(3);
    }
}
