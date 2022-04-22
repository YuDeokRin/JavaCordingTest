package Programmers;
/**
 * 하샤드 수
 *
 * 하샤드 수는 주어진 진법에서 그 수의 각 자릿수 숫자의 합으로 나누어떨어지는 자연수를 말한다.
 */

import java.util.Scanner;

public class harshad_number {

    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int n = x;
        while(x!=0){
            sum= sum + x%10;
            x= x/10;
        }

        return n%sum==0 ? true : false;
    }

    public static void main(String[] args) {
        harshad_number T = new harshad_number();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));

    }
}
