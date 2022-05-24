package BaekJoon.recursion;

/**
 * 10870번. 피보나치 수 5
 */


import java.util.*;
public class 피보나치_수_5{
    public int solution(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        else return solution(n-1) + solution(n-2);
    }

    public static void main(String[] args){
        피보나치_수_5 T = new 피보나치_수_5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(T.solution(n));

    }
}

