package T.Array02;

import java.util.Scanner;

public class Array09 {

    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE; // 정수형의 최소값을 넣은 이유는 최대값을 찾아야하기 때문이다.
        int sum1; //행의 합
        int sum2; //열의 합
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0 ;
            for (int j = 0; j < n; j++) {
                sum1+= arr[i][j];
                sum2+= arr[j][i];
            }
            answer =Math.max(answer, sum1);
            answer =Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1+= arr[i][i];
            sum2+= arr[i][n-i-1];
        }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args) {
        Array09 T = new Array09();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));

    }
}
