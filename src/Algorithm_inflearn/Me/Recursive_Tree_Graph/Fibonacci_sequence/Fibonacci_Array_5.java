package Algorithm_inflearn.Me.Recursive_Tree_Graph.Fibonacci_sequence;

import java.util.Scanner;


public class Fibonacci_Array_5 {
    public static void main(String[] args) {
        Fibonacci_Array_5 T = new Fibonacci_Array_5();
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

