package SWEA.Difficulty2;

import java.util.Scanner;

/**
 * 1946. 간단한 압축 풀기
 *
 * 'A' =  65
 *
 */
import java.util.Scanner;

public class 간단한압축풀기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "";
        for (int i =1; i <= t; i++) {
            System.out.println("#" + i);
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                char c = sc.next().charAt(0);
                int  num = sc.nextInt();
                for (int k = 0; k < num; k++) {
                    s +=c;
                    if (s.length() == 10){
                        System.out.println(s);
                        s = "";
                    }
                }
            }
            if (s.length() != 0) System.out.println(s);
            s = "";
        }
    }
}


