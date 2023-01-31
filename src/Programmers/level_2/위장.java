package Programmers.level_2;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public int solution(String[][] clothes) {
        Map<String, Integer> counts = new HashMap<>();


        //count값 구하기
        for(String[] c : clothes){
            //c[0] 의상의 이름 yellow_hat, blue_sunglasses
            //c[1] 의상의 종류  headgear ,eyewear
            String type = c[1];
//            counts.put(type, counts.get(type) == null ? 0 : counts.get(type) + 1 ) ;// HashMap에 의상의 종류를 키값으로 넣는다. (타입, 카운트값)
            counts.put(type, counts.getOrDefault(type, 0) + 1); // type에 값을 얻어왔는데 그게 null이라면 디폴트값으로 0을 넣는다. 그리고 그것에 1을 넣어서 put한다.
        }


        int answer = 1;
        for(Integer c : counts.values()){
            answer *= c + 1;
        }

        answer -= 1;

        return answer;
    }
}
