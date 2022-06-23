package algorithm100.algorithm4;

import java.util.Scanner;

/*
    -문제
    10진수를 2진수로 변환하시오.

    입력: 19
    출력: 10011

    tag : 배열 ,반복문(while, for)
 */
public class algorithm004 {
    public static void main(String[] args) {
        algorithm004 T = new algorithm004();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[100];

        // 19 / 2    9 ... 1
        // 9 /  2    4 ... 1
        // 4 /  2    2 ... 0
        // 2 /  2    1 ... 0
        // 1 /  2    0 ... 1
        int i = 0;
        while(n > 0){ //19 ,
            arr[i]=n%2; // n = 19 % 2;  n =1
            n /= 2 ;
            i++;
        }
        i--;
        for(; i>=0; i--){
        System.out.print(arr[i]);
        }

    }
}
