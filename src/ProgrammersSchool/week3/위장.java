package ProgrammersSchool.week3;

import java.util.Arrays;
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

        /*
            2. Stream으로 구현
         */
        public int solution2(String[][] clothes){
            int answer = Arrays.stream(clothes) // 모든 옷의 종류
                    .map(c -> c[1]) // 모든 옷에 1번 인덱스에 있는 종류들만 꺼낸다.
                    .distinct() // 중복없이
                    .map(type -> (int)Arrays.stream(clothes).filter(c -> c[1].equals(type)).count()) // type에 해당하는 것들만 filter해서 얻어오면
                    .map(c -> c + 1) // 필터로 얻어 온것들을 1을 더해서
                    .reduce(1, (c, n) -> c * n); // 누적해서 곱한 값 구하고

            return answer - 1; // 최종값에 -1 을 해서 리턴한다.
        }

        // solution2를 리팩토링 한 것.
        public int solution3(String[][] clothes) {
            return Arrays.stream(clothes)
                    .map(c -> c[1])
                    .distinct()
                    .map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count())
                    .map(c -> c + 1)
                    .reduce(1, (c, n) -> c * n) -1;
        }
    }



    public static void main(String[] args) {
        Solution T = new Solution();
        String[][] str = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(T.solution(str));
        System.out.println(T.solution2(str));
    }
}
