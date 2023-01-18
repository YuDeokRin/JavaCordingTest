package Programmers.level_0;

import java.util.Arrays;

public class 문자열정렬하기1 {

    public static void main(String[] args) {
        문자열정렬하기1 T = new 문자열정렬하기1();
        System.out.println(Arrays.toString(T.solution("hi12392")));
    }


    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");

        String[] arr = my_string.split("");
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(answer);

        return answer;
    }
}
