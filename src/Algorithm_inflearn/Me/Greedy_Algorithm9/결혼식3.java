package Algorithm_inflearn.Me.Greedy_Algorithm9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Time2 implements Comparable<Time2> {

    int time;
    char state; //피로연 참여하고 있는지(start), 떠난 상황인지(end)

    public Time2(int time, char state) {
        this.time = time;
        this.state = state;
    }


    @Override
    public int compareTo(Time2 o) {
        if(this.time == o.time) return this.state - o.state;
        else return this.time - o.time ;
    }
}

public class 결혼식3 {
    public int solution(ArrayList<Time2> arr) {
        int answer =Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt =0;
        for (Time2 ob : arr) {
            if (ob.state == 's') cnt++;
             else cnt--;
             answer = Math.max(answer, cnt);
        }
        return answer;
    }
    public static void main(String[] args) {
        결혼식3 T = new 결혼식3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time2> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sT = sc.nextInt(); // 피로연 들어온 시간
            int eT = sc.nextInt(); // 피로연 떠난 시간
            arr.add(new Time2(sT,'s'));
            arr.add(new Time2(eT, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}
