package SWEA.Difficulty3;

import java.util.Scanner;

/**
 * 1217. [S/W 문제해결 기본] 4일차 - 거듭 제곱
 */


public class 거듭제곱 {
    static int tc, n, m ;

    public int recursion(int n, int m){
        if(m<2) return n;
        return n *recursion(n, m-1);
    }
    public static void main(String[] args) {
        거듭제곱 T = new 거듭제곱();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            tc = sc.nextInt();
            n = sc.nextInt();
            m = sc.nextInt();
            System.out.println("#" + i+ " " + T.recursion(n,m));
        }
    }
}
