package SWEA.Difficulty2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1984. 중간 평균값 구하기
 */
public class 중간_평균값_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 1; i <= t; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int max =Arrays.stream(arr).max().getAsInt();
            int min =Arrays.stream(arr).min().getAsInt();
            int sum =Arrays.stream(arr).sum();
            double num =(sum - max - min)/8;

            System.out.println("#" + i+ " "+ Math.round(num));

        }
    }
}
