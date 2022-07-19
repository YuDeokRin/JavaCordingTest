package algorithm100;

import java.util.Scanner;

/*
    소수 찾기

    입력된 n이 소수인지 아닌지 판별하기

 */
public class 소수찾기007 {
    public boolean isPrimeNumber(int n){
        double end = Math.sqrt(n);
        for (int i = 2; i <= (int)end; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        소수찾기007 T = new 소수찾기007();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.isPrimeNumber(n));

    }
}
