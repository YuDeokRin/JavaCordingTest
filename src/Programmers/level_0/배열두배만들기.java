package Programmers.level_0;

import java.util.Arrays;

public class 배열두배만들기 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }


    public int[] solution2(int[] numbers) {

        return Arrays.stream(numbers).map(i -> i*2).toArray();
    }
}
