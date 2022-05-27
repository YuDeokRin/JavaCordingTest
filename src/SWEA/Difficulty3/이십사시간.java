package SWEA.Difficulty3;
/**
 * 12368. 24시간
 */

import java.util.Scanner;

public class 이십사시간 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int m = sc.nextInt();


            if ((t+m) == 24) {
                System.out.println("#"+ (i+1) + " "+ 0);
            }else if ((t+m) <=24 ){
                System.out.println("#"+ (i+1) + " "+ (t+m));
            }else {
                System.out.println("#"+ (i+1) + " " + (t+m-24));
            }

        }
    }
}
