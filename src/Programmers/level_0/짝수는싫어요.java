package Programmers.level_0;

import java.util.ArrayList;

public class 짝수는싫어요 {
    public int[] solution(int n) {
      int[] answer = new int[(n+1)/2];
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 1) {
                answer[i / 2] = i;
            }
        }


        return answer;
    }

    public ArrayList solution2(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i+=2) {
            answer.add(i);
        }


        return answer;
    }
}
