package Programmers.level_0;

import java.util.Arrays;

public class 배열뒤집기 {

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];


        for (int i = 0; i < num_list.length; i++) {
            answer[num_list.length - i - 1] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        배열뒤집기 T = new 배열뒤집기();
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(T.solution(ints)));
    }
}
