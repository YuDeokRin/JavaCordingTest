package SWEA.Difficulty3;

import java.util.Scanner;

/**
 * 13218. 조별과제
 */
public class 조별과제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println("#" + (i+1) + " " + (n/3));
        }
    }
}
