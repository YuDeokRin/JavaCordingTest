package Algorithm_inflearn.Me.Greedy_Algorithm9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if(this.end==o.end) return this.start - o.start; // 끝나는 시간이 같으면 시작시간으로 오름차순 정렬
        return this.end-o.end; // end 기준으로 오름차순
    }
}
public class 회의실배정2 {
    public  int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int endtime = 0; // 현재 회의하고 있는 회의 끝나는 시간
        for (Time o : arr) {
            if(endtime<=o.start) {
                cnt++;
                endtime = o.end;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        회의실배정2 T = new 회의실배정2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.add(new Time(start, end));
        }
        System.out.println(T.solution(arr,n));
    }
}
