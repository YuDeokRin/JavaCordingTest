package JavaCodingTest2;

import java.util.HashMap;

/**
 *  해싱 & 시간파싱
 *  9. 한번 사용한 최초문자
 *
 */

class firstLtterUsedOnce {
    public int solution(String s){
        HashMap<Character, Integer> sH = new HashMap<>();
        for(char x : s.toCharArray()){
            sH.put(x, sH.getOrDefault(x, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(sH.get(s.charAt(i)) == 1) return i+1;
        }
        return -1;
    }

    public static void main(String[] args){
        firstLtterUsedOnce T = new firstLtterUsedOnce();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }
}