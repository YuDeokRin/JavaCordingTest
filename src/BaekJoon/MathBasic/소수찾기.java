package BaekJoon.MathBasic;
/*
    1978. 소수 찾기

    -문제
    주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

    입력)
    첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

    출력)
    주어진 수들 중 소수의 개수를 출력한다.

    입력 예제)
    4
    1 3 5 7

    출력 예제)
    3


 */

import java.util.Scanner;

public class 소수찾기 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {

            boolean isPrime = true; // 소수이면 true, 아니면 false

            int arr = in.nextInt(); // 4개 숫자 받는다. -> 1 3 5 7

            if(arr == 1) continue; // 1이면 pass시킨다.

            for (int j = 2; j < Math.sqrt(arr); j++) {
                if (arr % j == 0) { // 한번이라도 나누어 떨어질 경우
                    isPrime = false; // 소수가 아니라서 바꾼다.
                    break;
                }
            }

            if(isPrime) count++;
        }
        System.out.println(count);
    }

}
