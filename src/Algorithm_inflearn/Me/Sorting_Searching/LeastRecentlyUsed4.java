package Algorithm_inflearn.Me.Sorting_Searching;

import java.util.Scanner;

/**
 * 4. Least Recently Used(LRU)
 * 5 9
 * 1 2 3 2 6 2 3 5 7
 */
public class LeastRecentlyUsed4 {
    public int[] solution(int size, int n, int arr[]) {
        int[] cache = new int[size];
        for (int x : cache) {

        }



        return cache;
    }

    public static void main(String[] args) {
        LeastRecentlyUsed4 T = new LeastRecentlyUsed4();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(s,n,arr)) System.out.println(x + " ");
    }
}
