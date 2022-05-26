package Algorithm_inflearn.Me.Greedy_Algorithm9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class 선수 implements Comparable<선수>{
    int key;
    int weight;

    public 선수(int key, int weight) {
        this.key = key;
        this.weight = weight;
    }

    @Override
    public int compareTo(선수 o) {
        return o.key - this.key; // 키 기준으로  내림차순이 된다.
    }
}
public class 씨름선수 {


    private int solution(ArrayList<선수> arr, int n) {
        int cnt = 0;
        Collections.sort(arr); // 위에 compareTo 기준으로 정렬이된다.
        int max = Integer.MIN_VALUE;
        for(선수 x : arr){
            if (x.weight>max){ // 기준 선수의 몸무게(max) 보다 높으면 참
                max = x.weight;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        씨름선수 T = new 씨름선수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5명 참여
        ArrayList<선수> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt(); // 키
            int w = sc.nextInt(); // 몸무게
            arr.add(new 선수(h, w));
        }
        System.out.println(T.solution(arr,n));
    }
}
