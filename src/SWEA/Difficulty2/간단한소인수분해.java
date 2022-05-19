package SWEA.Difficulty2;
/**
 * 1945. 간단한 소인수 분해
 */

import java.util.Scanner;

public class 간단한소인수분해 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int N = sc.nextInt();
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            while(true){
                if (N%2 == 0){
                    N = N/2;
                    a++;
                } else if (N%3 ==0) {
                        N = N/3;
                        b++;
                }else if (N%5 == 0) {
                        N = N/5;
                        c++;
                }else if (N%7==0) {
                        N = N/7;
                        d++;
                }else if (N%11 == 0) {
                        N = N/11;
                        e++;
                }
                if (N==1) break;
            }
                System.out.println("#"+ i+ " " + a +" " + b + " "+ c+ " "+ d+" "+e);
        }
    }
}
