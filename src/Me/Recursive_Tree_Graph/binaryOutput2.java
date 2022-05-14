package Me.Recursive_Tree_Graph;

import java.util.Scanner;

public class binaryOutput2 {
    private void DFS(int n) {
        if(n == 0) return;
        else{
            DFS(n/2);
            System.out.println(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        binaryOutput2 T = new binaryOutput2();
        T.DFS(11);
    }
}
