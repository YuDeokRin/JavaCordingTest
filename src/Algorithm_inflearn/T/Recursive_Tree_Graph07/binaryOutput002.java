package Algorithm_inflearn.T.Recursive_Tree_Graph07;

public class binaryOutput002 {
    public void DFS(int n) {
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        binaryOutput002 T = new binaryOutput002();
        T.DFS(11);
    }
}
