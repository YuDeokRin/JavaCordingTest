package Algorithm_inflearn.T.Recursive_Tree_Graph07.Fibonacci;

import java.util.Scanner;

public class Fibonacci_Array {
    public static void main(String[] args) {
        Fibonacci_Array T = new Fibonacci_Array();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 3; i < n; i++) {
            arr[1] = 1;
            arr[2] = 1;
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[i] + " ");
        }

    }
}
