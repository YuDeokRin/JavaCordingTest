package Me.Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 8. 이분 검색
 *
 */
public class binarySearch8 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt;
        int rt = n-1;
        Arrays.sort(arr);
        for (lt = 0; lt < n; lt++) {
              int mid = (lt + rt) / 2;
              if (arr[mid] == m){
                  answer = mid+ 1;
              } else if(arr[mid] > m ){
                  rt = mid-1;
              }else{
                  lt = mid+1;
              }
        }
        return answer;
    }

    public static void main(String[] args) {
        binarySearch8 T = new binarySearch8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
