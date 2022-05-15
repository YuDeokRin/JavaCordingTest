package BaekJoon;

import java.util.*;

/**
 *  코딩 연습공간
 *  ()(((()())(())()))(())
 */
import java.util.Scanner;

public class Main {
    public int count(int[] arr, int capacity){
        int cnt = 1 ;
        int sum = 0 ;
        for(int x : arr){
            cnt++;
            sum=x;
        }
        return cnt;
    }
    public int solution(int n,int m,int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); //9
        int rt = Arrays.stream(arr).sum(); // 45
        while(lt<=rt){
            int mid=(lt + rt)/2;
            if (count(arr,mid)<= m){
                answer =mid;
                rt = mid-1;
            }
            else lt =mid+1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n,m,arr));
    }
}

