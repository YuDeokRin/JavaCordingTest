package BaekJoon.Sort;
/**
 * 2750번. 수 정렬하기
 *
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */

import java.util.*;
public class 수_정렬하기{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j = 0; j<arr.length-i-1 ; j++){
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int x : arr){
            System.out.println(x);
        }


    }
}

