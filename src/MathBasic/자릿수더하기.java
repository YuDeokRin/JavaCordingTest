package MathBasic;

import java.util.Scanner;

public class 자릿수더하기 {
    public int solution(int n) {
//        System.out.println(n%10); // 예) n = 6789 -> 9
//        System.out.println(n/10); // 예) n = 6789 ->678
        int sum = 0 ;
        while(n>0){
            sum+=n%10;
            n = n/10;
        }


        return sum;
    }

    public static void main(String[] args) {
        자릿수더하기 T = new 자릿수더하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));

    }
}
