package Algorithm_inflearn.Me.Stack_Queue;
/**
 * 6.공주 구하기 (Queue)
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class savePrincess6 {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.offer(i); // Queue에 왕자들을 배치시킨다. 1,2,3,4,5,6,7,8...n까지
        while (!Q.isEmpty()){ // Queue공간에 값이 없지 않을 경우 :  true
                              // Queue공간에 값이 없을 경우 : false
            for (int i = 1; i < k; i++) Q.offer(Q.poll()); //Q.poll()했던 값들을 Q.offer()해서 Q에 넣어준다.
            System.out.println(Q);
            Q.poll();
            if (Q.size()==1) answer = Q.poll();
        }


        return answer;
    }

    public static void main(String[] args) {
        savePrincess6 T = new savePrincess6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.solution(n,k));
    }
}
