package Algorithm_inflearn.T.Two_pointers03;

/**
 * 5. 연속된 자연수의 합(수학)
 */

import java.util.Scanner;

public class two_pointers_algorithm005_1 {
    public int solution(int n) {
        int answer = 0 ;
        int cnt =1;
        n--;
        while (n>0){
            cnt++;
            n = n - cnt;
            if(n%cnt==0){
                System.out.println(n + " " + cnt);
                answer++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        two_pointers_algorithm005_1 T = new two_pointers_algorithm005_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
