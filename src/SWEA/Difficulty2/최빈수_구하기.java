package SWEA.Difficulty2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *  1204. 최빈수 구하기
 */
public class 최빈수_구하기 {
//    public HashMap<Integer, Integer> solution(int n, int[] arr){
//        HashMap<Integer, Integer> answer = new HashMap<>();
//
//
//        return answer;
//    }
    public static void main(String[] args) {
        최빈수_구하기 T = new 최빈수_구하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(str, " ");
            while(st.hasMoreTokens()){
                int num = sc.nextInt();
                map.put(num, map.getOrDefault(num, 0)+1);
            }
            int result = 0;
            int max = 0;
            for(int x : map.keySet()){
                if (max==0) max = map.get(x);
                 else if (max <= map.get(x)) {
                    max = map.get(x);
                }
                 if(max== map.get(x)){
                     result = Math.max(result, x);
                 }else {
                     result=x;
                 }
            }
        System.out.println("#" + str +  " " +  result);
        }
    }
}
