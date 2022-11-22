package ProgrammersSchool.week1;

import java.util.LinkedList;
import java.util.Queue;

public class 기지국설치 {

    public static class Solution{

        public int solution(int n, int[] stations, int w) {
            int answer = 0;
            int stationsIndex = 0;
            int position = 1;

            while(position <= n){
                if(stationsIndex < stations.length && stations[stationsIndex] - w <= position ){
                    position = stations[stationsIndex] + w + 1;
                    stationsIndex += 1;
                }else{
                    answer += 1;
                    position += w * 2 + 1;
                }
            }

            return answer;
        }

        /* queue로 구현 -> 하지만 효율성 테스트에서 불합격
        public int solution(int n, int[] stations, int w){
            int answer = 0; //기지국 개수 구하기

            Queue<Integer> sq = new LinkedList<>();
            for(int s : stations) sq.offer(s);

            int position = 1; //1동부터 시작
            while(position <= n){
                if(sq.peek() - w <= position){
                    position = sq.poll() + w + 1;
                }else{
                    answer +=1 ;
                    position += w * 2 + 1;
                }
                answer += 1;
                position += w * 2 + 1; // 전체 전파 범위 왼쪽전파 범위, 오른쪽 전파 범위 -> w * 2

            }



            return answer;
        }

         */
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(11, new int[]{4, 11}, 1));
    }
}
