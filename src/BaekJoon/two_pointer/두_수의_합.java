package BaekJoon.two_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 3273. 두 수의 합
 */
public class 두_수의_합 {
    public int solution(int n, int[] arr, int x) {
        Arrays.sort(arr);
        int start = 0;
        int end = n-1;
        int count = 0; // 쌍 개수 세워주는 변수

        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum == x) count++;
            if(sum <= x) start++;
            else end--;
        }


        return count;
    }

    public static void main(String[] args){
        두_수의_합 T = new 두_수의_합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.print(T.solution(n, arr, x));
    }
}
