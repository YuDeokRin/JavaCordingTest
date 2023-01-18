package Programmers.level_0;

import java.util.Arrays;

public class 배열의평균값 {
    static class Solution {
        public double solution(int[] numbers) {
            double answer = 0;
            for(int num : numbers){
                answer += num;
            }
            answer = answer / numbers.length;
            return answer ;
        }


        //람다식
        public double solution2(int[] numbers) {
            return Arrays.stream(numbers).average().orElse(0);
        }
    }




    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
