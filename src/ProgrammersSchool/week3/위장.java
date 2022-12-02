package ProgrammersSchool.week3;

import java.util.HashMap;
import java.util.Map;

public class 위장 {

    static class Solution {
        public int solution(String[][] clothes) {
            Map<String, Integer> counts = new HashMap<>();

            for (String[] c : clothes) {
                String type = c[1];
//                counts.put(type, counts.get(type) == null ? 0 : counts.get(type) + 1);
                counts.put(type, counts.getOrDefault(type, 0)+ 1);

            }

            int answer = 1;
            for(Integer c : counts.values()){
                answer *= c + 1;

            }

            answer -= 1;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[][] str = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(T.solution(str));
    }
}
