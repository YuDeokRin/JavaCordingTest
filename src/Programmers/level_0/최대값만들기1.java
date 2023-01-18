package Programmers.level_0;

import java.util.Arrays;

public class 최대값만들기1 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        answer = max * numbers[numbers.length-2];
        return answer;
    }


    public int solution2(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}
