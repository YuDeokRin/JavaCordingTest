package Algorithm_inflearn.T.Dynamic_programming010;
/**
 * 2. 돌다리 건너기
 *
 * 해결 알고리즘 : 피보나치 수열
 *
 * 앞서 풀어본 계단 올라가기랑 똑같다. 단 한가지 차이점이라면 마지막에 도착 지점까지라는 말이 있기때문에
 * 다 도착할 때 까지라는 것을 명심하자
 */

import java.util.Scanner;

public class Cross_the_stone_bridge002 {
    static int[] dy;
    public int solution(int n){
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n+1; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n+1];
    }


    public static void main(String[] args){
        Cross_the_stone_bridge002 T = new Cross_the_stone_bridge002();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n+2]; // 배열의 인덱스를 1부터 시작하기로 설정
        System.out.println(T.solution(n));
    }
}
