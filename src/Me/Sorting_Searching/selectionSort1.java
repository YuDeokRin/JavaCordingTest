package Me.Sorting_Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class selectionSort1 {

    public static void solution(int[] arr){
        solution(arr, 0);
    }


    public static void solution(int[] arr, int start) {
        if (start < arr.length - 1) {
            int min_index = start;
            for (int i = start; i < arr.length; i++) {
                if(arr[i] < arr[min_index]) min_index = i;
            }
            swap(arr, start, min_index);
            solution(arr, start + 1);
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;

    }

    public static void printArray(int[] arr){
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        selectionSort1 T = new selectionSort1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
        printArray(arr);
    }
}
