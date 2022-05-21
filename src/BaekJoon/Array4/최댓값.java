package BaekJoon.Array4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2562.최댓값
 */
public class 최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9]; //정수 9개를 담는 배열 선언


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 배열 안에 값을 넣는다.  0 ~ arr.length까지
        }

        int max = 0; // 기준의 될 첫번 째 값
        int index = 0; // 최대값의 위치(인덱스)

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max) { // arr[1] = 3; tmp = 0  ->  tmp = 3 ;   arr[2] = 4 , tmp = 3;
                max = arr[i];
                index = i+1; // max값의 위치를 index에 저장 for문이 0이므로 인덱스에 +1 해준다.
            }
        }
        System.out.println(max);
        System.out.print(index);
    }
}