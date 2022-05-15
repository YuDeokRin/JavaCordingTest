package Algorithm_inflearn.Me.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 2. 아나그램(HashMap)
 */

public class HashMap2 {
    public String solution(String s, String str) {
        String answer ="YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (char k : str.toCharArray()) {
            if (!map.containsKey(k) || map.get(k)==0 ) return "NO";
            map.put(k,map.get(k)-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap2 T = new HashMap2();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = sc.next();
        System.out.println(T.solution(s,str));
    }
}
