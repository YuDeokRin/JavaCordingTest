package BaekJoon.bruteForce;

import java.util.Scanner;

/*
    1065. 한수

    -문제
    어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
    N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

    -입력
    첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

    -출력
    첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

    -예제 입력1
    110

    -예제 출력1
    99

    -예제 입력2
    1

    -예제 출력2
    1



    백의 자릿수 = i / 100
    십의 자릿수 = (i / 10) % 10
    일의 자릿수 = i % 10
 */

public class 한수 {
    public int soultion(int n) {
        int hansu = 0;


        if (n < 100) {
            return n;
        }else{
            hansu = 99;

            for (int i = 100; i <=n ; i++) {
                int hundreds = i/ 100; // 백의 자리
                int tens =(i/10) % 10 ; // 십의 자리
                int units = i%10; // 일의 자리

                //hundreds - tens == ten - units 각 자릿수가 수열을 이루면 cnt ++;
                if((hundreds - tens) == tens - units) {
                    hansu++;
                }
            }

        }
        return hansu;
    }

    public static void main(String[] args) {
        한수 T = new 한수();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //123

        System.out.println(T.soultion(N));
    }
}
