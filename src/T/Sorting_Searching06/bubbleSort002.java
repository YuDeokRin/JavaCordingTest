package T.Sorting_Searching06;

/**
 * 2.버블정렬
 */

import java.util.Scanner;

public class bubbleSort002 {
    public int[] solution(int n, int[] arr){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n-i-1; j++) {
                if (arr[i]<arr[j+1]){
                    int tmp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        selectionSort001 T = new selectionSort001();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
