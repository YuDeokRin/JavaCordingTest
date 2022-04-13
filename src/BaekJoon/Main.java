package BaekJoon;


/**
 * 연습장
 * 1. 부터 까지의 자연수를 전부 나열한다.  n = 20;
 *
 * 2. 소수도, 합성수도 1 아닌 을 지운다.
 *
 * 3. 남아 있는 자연수 중 가장 작은 2 수인 는 소수다. 이제 2의 배수들을 모두 지운다.
 *
 * 4. 남아 있는 자연수 중 가장 작은 3 수인 은 소수다. 이제 3의 배수들을 모두 지운다.
 *
 * 5. 남아 있는 자연수 중 가장 작은 수는 소수다. 이 수의 배수들을 모두 지운다.
 *
 *
 */

import java.util.Scanner;
public class Main {
    public int solution(int n){
        int answer = 0;
        int ch[] = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0){
                answer++;
                for (int j = i; j < n ; j = j + 1) {
                }
            }
        }
        return answer ;
    }

        public static void main(String[] args) {
            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(T.solution(n));
        }
}

