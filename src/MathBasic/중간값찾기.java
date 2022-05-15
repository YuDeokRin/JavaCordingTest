package MathBasic;

import java.util.Arrays;
import java.util.Scanner;

public class 중간값찾기 {
    public int solution(int n, int[] arr) {
        int mid = 0;
        Arrays.sort(arr); // arr 배열을 정렬해준다.
        mid = arr[n/2]; // 배열 중 중간 값

        return mid;
    }

    public static void main(String[] args) {
        중간값찾기 T = new 중간값찾기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
