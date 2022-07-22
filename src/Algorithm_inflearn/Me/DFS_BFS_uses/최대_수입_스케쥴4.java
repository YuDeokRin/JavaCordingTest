package Algorithm_inflearn.Me.DFS_BFS_uses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 내림 차순 정렬을 위해서
class Lecture implements Comparable<Lecture>{
    int money;
    int date;

    public Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.date - this.date; // 매개변수 - this = 내림차순(des)
    }
}

public class 최대_수입_스케쥴4 {

    static int N,max=Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);

        int j = 0;
        for (int i = max; i >= 1; i--) {
            for(; j<N; j++){
                if(arr.get(j).date < i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer+= pQ.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        최대_수입_스케쥴4 T = new 최대_수입_스케쥴4();
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int M = in.nextInt();
            int D = in.nextInt();
            arr.add(new Lecture(M,D));
            if(D > max) max = D;
        }
        System.out.println(T.solution(arr));
    }
}
