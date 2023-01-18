package Programmers.level_0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 짝수홀수개수 {

    public static void main(String[] args) {
        짝수홀수개수 T = new 짝수홀수개수();
        System.out.println(Arrays.toString(T.solution(new int[]{1,2,3,4,5})));
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int n : num_list) {
            if (n % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }

        }
        return answer;
    }

    //람다식인데 오히려 가독성이 떨어진다.
    public int[] solution2(int[] num_list) {
        return IntStream.of((int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(),
                (int) Arrays.stream(num_list).filter(i -> i % 2 == 1).count()).toArray();
    }
}
