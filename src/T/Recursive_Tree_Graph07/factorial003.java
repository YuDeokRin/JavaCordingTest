package T.Recursive_Tree_Graph07;

public class factorial003 {
    public int DFS(int n) {
        if (n == 1) return 1;
        else{
         return  n*DFS(n-1);
        }
    }

    public static void main(String[] args) {
        factorial003 T = new factorial003();
        System.out.println(T.DFS(5));
    }
}
