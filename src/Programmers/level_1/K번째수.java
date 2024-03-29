package Programmers.level_1;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            int ed = commands[i][1];
            int st = commands[i][0];

            int[] temp = new int[ed - st + 1];

            for (int j = 0; j <= ed-st; j++) {
                temp[j] = array[j + st - 1];
            }

            Arrays.sort(temp);

            answer[i] = temp[commands[i][2]-1];
        }

        return answer;

    }


    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }

        return answer;
    }

}
