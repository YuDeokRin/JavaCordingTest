package Programmers.level_0;

import java.util.Arrays;

public class 삼각형의완성조건1 {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        if (sides[2] < (sides[0] + sides[1])) {
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }

    public int solution2(int[] sides) {
        int answer = 2;

        int index = 0;
        int max = 0;

        for (int i = 0; i < sides.length; i++) {
            if (sides[i] > max) {
                max = sides[i];
                index = i;
            }
        }

        int sum = 0 ;
        for (int i = 0; i < sides.length; i++) {
            if (i != index) {
                sum += sides[i];
            }
        }

        if (sum > max) {
            answer = 1;
        }

        return answer;
    }
}
