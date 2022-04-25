package Programmers;

import java.util.Arrays;
import java.util.HashMap;

public class non_completion_sort {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;

        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) return participant[i];
        }
        return participant[i];
    }

    public static void main(String[] args) {
        non_completion T = new non_completion();
        String[] participant = {"leo","kiki","eden"};
        String[] completion = {"kiki","eden"};
        System.out.println(T.solution(participant,completion ));
    }
}
