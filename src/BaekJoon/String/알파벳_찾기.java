package BaekJoon.String;

import java.util.Scanner;

public class 알파벳_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26]; // 출력되는 배열

        //arr[] 전체를 -1로 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        //입력값 받기
        String s = sc.nextLine();

        //입력값을 쪼개준다.
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (arr[ch - 'a']== -1){
                arr[ch - 'a'] = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
