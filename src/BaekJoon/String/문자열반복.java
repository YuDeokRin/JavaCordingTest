package BaekJoon.String;

import java.util.Scanner;

/**
 * 11720. 문자열 반복
 *
 */
public class 문자열반복 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 몇개 입력 할지

        //입력 값들 받는 for문
        for(int i =0; i<n; i++){

           int r = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                char[] p = s.toCharArray(); // String을 char로 각 한단어씩 짜르
                for (int k = 0; k <r; k++) { // r까지 반복
                    System.out.print(p[j]);
                }
            }
            System.out.println();
        }
    }
}

