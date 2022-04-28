package Me.HashMap_TreeSet;
/**
 * 1. 학생 회장 (해쉬)
 */

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {

    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        //15개의 학생들을 만들어 준다.
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x,0)+1);
        }

        int max = Integer.MIN_VALUE;
        for (Character str : map.keySet()) {
            if (max < map.get(str)){
                max = map.get(str);
                answer =str;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap1 T = new HashMap1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(T.solution(n, s));
    }
}
