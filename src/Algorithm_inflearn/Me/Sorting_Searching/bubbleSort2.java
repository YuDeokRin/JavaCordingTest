package Algorithm_inflearn.Me.Sorting_Searching;

import java.util.Scanner;

public class bubbleSort2 {

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int a= j + 1;
                if (arr[j] > arr[a]){
                    int tmp = arr[j];
                    arr[j] = arr[a];
                    arr[a] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        bubbleSort2 T = new bubbleSort2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
