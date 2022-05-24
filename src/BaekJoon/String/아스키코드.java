package BaekJoon.String;
/**
 * 11654. 아스키코드
 */

import java.util.Scanner;

public class 아스키코드 {

    public static void main(String[] args){
        아스키코드 T = new 아스키코드();
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.printf("%d", (int)c);
    }
}
