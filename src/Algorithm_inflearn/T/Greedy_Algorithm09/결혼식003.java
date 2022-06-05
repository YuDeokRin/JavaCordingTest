package Algorithm_inflearn.T.Greedy_Algorithm09;
/**
 * 3. 결혼식
 *  시간상의 그림으로 그려서 하면 더욱 이해가 잘됨
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Guest implements Comparable<Guest>{

    int time; // 시간을 저장하는 변수(0시부터 24시)  // 5 , 12, 14, 14, 15, 15, 18, 20, 20, 30  이렇게 들어감
    char state ; // 상태를 저장하는 변수(있는가? 없는가?) // 's'(5), 's'(12), 'e'(14), 's'(14), 'e'(15), 's'(15), 'e'(18), 'e'(20), 's'(20), 'e'(30)
                                                 // 관건은 s와 e가 겹치는 시간은 무조건 e부터 뺴줘야한다. 빼주고 카운트
    public Guest(int time, char state){
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Guest o) {
        if (this.time == o.time)  return this.state - o.state; //시간이 같다? 그럼 state로 정렬이라는 뜻 -> 's' or 'e'?
        else return this.time - o.time; // 시간이 다를 경우 오른차순 정렬
렬   }



}
public class 결혼식003 {
    public int solution(ArrayList<Guest> arr) {
        int answer = Integer.MIN_VALUE; // 최소값을 넣는다. 이유 : 최대값을 꺼내기위해. 0을 넣어줘도 된다.
        Collections.sort(arr); // 정렬해준다. 정렬의 기준은 @Override로 재정의하여 오름차순으로 정렬
        int cnt = 0;
        for (Guest object : arr) { //정렬된 arr를 object에 넣어준다.
            if (object.state == 's') cnt++; //object의 상태가 's'(시작) 했다면 cnt++(인원수를 늘려준다.)
            else cnt--; // 'e'가 나온다면 인원수를 뺴준다. 범위는 정각이면 나간것으로 판단해서 빼준다.
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        결혼식003 T = new 결혼식003();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Guest> arr = new ArrayList<>(); //
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt(); // 시작 시간
            int end = sc.nextInt(); // 끝나는 시간
            arr.add(new Guest(start, 's'));
            arr.add(new Guest(end, 'e'));
        }
        System.out.println(T.solution(arr));

    }
}
