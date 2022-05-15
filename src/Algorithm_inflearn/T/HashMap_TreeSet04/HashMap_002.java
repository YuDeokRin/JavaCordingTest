package Algorithm_inflearn.T.HashMap_TreeSet04;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 2. 아나그램(HashMap)
 */

public class HashMap_002 {
    public String solution(String s, String str) {
        String answer ="YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for (char x : str.toCharArray()) {
            if (!map.containsKey(x) || map.get(x)==0) return "No";
            map.put(x,map.get(x)-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap_002 T = new HashMap_002();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = sc.next();
        System.out.println(T.solution(s,str));
    }
}




