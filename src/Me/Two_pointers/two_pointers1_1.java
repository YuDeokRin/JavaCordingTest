package Me.Two_pointers;
/**
 * 1. 두 배열 합치기(two pointers algorithm)
 *
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class two_pointers1_1 {

    public int[] solution(int n, int m, int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b,0, result, a.length, b.length);

        Arrays.sort(result);

        return result ;
    }

    public static void main(String[] args) {
        two_pointers1_1 T = new two_pointers1_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m= sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int x : T.solution(n,m,a,b)) {
            System.out.print(x + " ");
        }
    }
}

