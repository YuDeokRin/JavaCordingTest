package BaekJoon.input_output;

import java.util.Scanner;

/**
 * 10871. X보다 작은 수
 */
public class X보다_작은_수 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        //10개 입력 받는다.
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0; i<n; i++){
            if(arr[i]<x){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
