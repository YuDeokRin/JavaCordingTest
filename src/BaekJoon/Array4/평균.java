package BaekJoon.Array4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1546. 평균
 * 점수/M*100
 */
public class 평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        double sum = 0;
        double num = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int a = Arrays.stream(arr).max().getAsInt();
            sum += arr[i];
            num = (sum/a)*100;
        }
            System.out.println(num/n);


    }
}
