package SWEA.Difficulty2;

import java.util.Scanner;

/**
 * 1986. 지그재그 숫자
 */
public class 지그재그숫자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int sum =0;
            int m = sc.nextInt();

            for (int j = 1; j <= m; j++) {
                if (j%2==1) sum+=j;
                else sum-=j;
            }
                System.out.println("#" + (i+1) + " " + sum);
        }
    }
}
