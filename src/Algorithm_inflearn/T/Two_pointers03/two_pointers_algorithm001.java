package Algorithm_inflearn.T.Two_pointers03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  1. 두 배열 합치기(two pointers algorithm)
 */

public class two_pointers_algorithm001 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while(p1 < n && p2 < m){
            if (a[p1] < b[p2]){
             answer.add(a[p1++]);
            }else{
                answer.add(b[p2++]);
            }
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        two_pointers_algorithm001 T = new two_pointers_algorithm001();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int x : T.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
