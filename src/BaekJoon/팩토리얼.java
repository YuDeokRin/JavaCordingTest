package BaekJoon;

import java.util.Scanner;

public class 팩토리얼{
    public int solution(int n){
        if (n==0) return 1;
        if(n == 1) return 1;
        else{
            return n*solution(n-1);
        }
    }

    public static void main(String[] args) {
        팩토리얼 T = new 팩토리얼();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(T.solution(n));
    }
}

