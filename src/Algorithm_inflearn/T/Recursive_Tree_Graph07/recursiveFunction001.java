package Algorithm_inflearn.T.Recursive_Tree_Graph07;

public class recursiveFunction001 {
    private void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        recursiveFunction001 T = new recursiveFunction001();

        T.DFS(3);
    }
}
