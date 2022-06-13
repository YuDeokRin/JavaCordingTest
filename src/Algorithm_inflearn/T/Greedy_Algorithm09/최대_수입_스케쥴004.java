package Algorithm_inflearn.T.Greedy_Algorithm09;
/*
    4. 최대 수입 스케쥴(PriorityQueue 응용 문제)


 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
    public int money;
    public int date;

    Lecture(int money, int date){
        this.money = money;
        this.date = date;
    }


    @Override
    public int compareTo(Lecture ob) {
        return ob.date -  this.date; // 매개변수 - this =   내림차순으로 정렬    cf, this.변수 - 매개변수 = 오름차순 정
    }
}


public class 최대_수입_스케쥴004 {
    static int n , max = Integer.MIN_VALUE;


    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        //PriorityQueue<Integer> pQ  = new PriorityQueue<>();  <-- 기본형은 작은 값을 우선으로 poll() 해준다.
        //                                                         큰 값을 우선으로 poll() 해주는 PriorityQueue
        PriorityQueue<Integer> pQ  = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for(int i =max; i>=1; i--){
            for( ; j<n; j++){
                if(arr.get(j).date<i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer+=pQ.poll();
        }
        return answer;
    }

    public static void main(String[] args){
        최대_수입_스케쥴004 T = new 최대_수입_스케쥴004();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 강좌의 개수
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int m = sc.nextInt(); // 돈
            int d = sc.nextInt(); // 날짜
            arr.add(new Lecture(m,d));
            if(d > max) max = d; // 날짜 중에 가장 큰값 찾아내기 위해서
        }
        System.out.println(T.solution(arr));
    }
}
