package Programmers;
/**
 * 완주하지 못한 선수
 *
 */

import java.util.HashMap;

public class non_completion {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i],map.getOrDefault(participant[i], 0)+1);
        }
        for (int i = 0; i < completion.length; i++) {

            if (map.containsKey(completion[i])){
                map.replace(completion[i], map.getOrDefault(completion[i], 0)-1);
            }
        }

        for (String s : map.keySet()) {
            if (map.get(s)==1) answer=s;
        }
        return answer;
    }

    public static void main(String[] args) {
        non_completion T = new non_completion();
        String[] participant = {"leo","kiki","eden"};
        String[] completion = {"kiki","eden"};
        System.out.println(T.solution(participant,completion ));
    }
}
