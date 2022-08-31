package BaekJoon.bruteForce;

import java.io.*;

/*

    9095. 1,2,3 더하기

    문제
    정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

    1+1+1+1
    1+1+2
    1+2+1
    2+1+1
    2+2
    1+3
    3+1
    정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.

    출력
    각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.

    예제 입력 1  복사
    3
    4
    7
    10

    예제 출력 1  복사
    7
    44
    274

 */
public class 일이삼_더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 케이스 3

        int arr[] = new int[11];
        arr[1] = 1; // 1을 넣을 경우 : 1 -> 1가지  
        arr[2] = 2; // 2를 넣을 경우 : (1+1), 2   -> 2가지
        arr[3] = 4; // 3을 넣을 경우 : (1+1+1), (2+1), (1+2), 3 -> 4가지



        for (int i = 0; i < T; i++) { //1, 2 ,3
            int n = Integer.parseInt(br.readLine());

            for (int j = 4; j <= n; j++) {
                arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
            }
            System.out.println(arr[n]);
        }

    }
}
