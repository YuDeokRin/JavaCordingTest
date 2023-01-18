package Programmers.level_0;

import java.util.Arrays;

public class 배열자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};

        answer = Arrays.copyOfRange(numbers, num1, num2);


        return answer;
    }
}
