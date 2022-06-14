package BaekJoon.Greed_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
1931. 회의실 배정

- 알고리즘 분류 : 그리디 알고리즘(Greedy), 정렬(sort)

- 문제
한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다.
각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자. 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.

Tip. 회의의 시작시간과 끝나는 시간으 조건은 (시작시간(start) <= 끝나는 시간(end))

- 끝나는 시간으로만 정렬했을 경우의 반례
입력예제)
    3
    3 3
    1 3
    2 3
끝나는 시간으로만 정렬 했을 경우 3 3 밖에 안나온다, 하지만 원래는 (1 3, 3 3), (2 3, 3 3) 두 가지의 경우가 나타나야한다.
그래서 위와같이 나타날 경우, 끝나는 수가 다 같을 경우 앞의 시작 시간을 보고 파악하는 것도 중요하다.

 */

class Use implements Comparable<Use>{
    int start ;
    int end ;

    Use(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Use ob) {
        if(this.end == ob.end) return this.start - ob.start; // 끝나는 시간이 같으면 반례가 생긴다. 그래서 같을 경우 시작하는 시간 기준 정렬 해준다.
        return this.end - ob.end; // 끝나는 시간을 기준으로 오름차순 정렬
    }
}
public class 회의실배정 {
    public int solution(ArrayList<Use> list, int n) {
        int cnt = 0;
        Collections.sort(list);
        int enduse = 0; // 현재 회의하고 있는 회의가 끝나는 시간
        for(Use object : list ){
            if(enduse <= object.start) {  // object에 start시간이 끝나는 시간(enduse)보다 크거나 같으면 참
                cnt++;
                enduse = object.end; // object.end는 회의를 진행하기때문에 enduse에 넣어준다.
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        회의실배정 T = new 회의실배정();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        ArrayList<Use> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Use(start, end));
        }
        System.out.println(T.solution(list, n));
    }

}
