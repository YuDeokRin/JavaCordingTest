package Me.Recursive_Tree_Graph;

import java.util.Scanner;

public class factorial3 {
    public int DFS(int n) {
        if(n==1) return 1 ;
        else{
            return n*DFS(n -1);
        }
    }

    public static void main(String[] args) {
        factorial3 T = new factorial3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.DFS(n));

    }
}
