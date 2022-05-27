package SWEA.Difficulty3;
/**
 * 3431. 준환이의 운동관리
 */

import java.util.Scanner;

public class 준환이의운동관리 {
    public static void main(String[] args) {
        준환이의운동관리 main = new 준환이의운동관리();
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            int X = sc.nextInt();

            if(X < L){
                System.out.println("#" + (i+1) +" " + (L - X));
            } else if (X >= L && X <= R) {
                System.out.print("#" + (i+1) +" " + 0);
            }else {
                System.out.println("#" + (i+1) +" " + -1);
            }
        }

    }
}
