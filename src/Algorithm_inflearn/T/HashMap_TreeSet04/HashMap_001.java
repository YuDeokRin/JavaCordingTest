package Algorithm_inflearn.T.HashMap_TreeSet04;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_001 {
    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        //N명의 학생 수
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x,0)+1); //key는 있는데 value가 없을 경우 디폴트로 0으로 만들어주고 +1을 해준다.
        }
        //containsKey()는 어떤 객체(Map으로 이루어진 객체)에 ( Object key)가 존재하는지 boolean으로 확인하는 함수
        //System.out.println(map.containsKey('A'));

        //size()는 key의 종류 갯수를 알려준다.
        System.out.println(map.size());

        //remove()는 특정 key를 삭제한다. return 해주는 것은 key의 갯수를 리턴해준다.
        //System.out.println(map.remove('A'));
        //System.out.println(map.size());

        int max = Integer.MIN_VALUE;
        for (char key :map.keySet()) {
            //System.out.println(x + " " + map.get(x));
            if (map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }





        return answer;
    }

    public static void main(String[] args) {
        HashMap_001 T = new HashMap_001();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str= sc.next();
        System.out.println(T.solution(n, str));
    }
}
