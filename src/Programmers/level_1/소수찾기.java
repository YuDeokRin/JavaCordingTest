package Programmers.level_1;

import java.util.Scanner;

public class 소수찾기 {
    private int solution(int n) {
        int answer = 0;
        int ch[] = new int[n + 1];

        for (int i = 2; i <= n; i++) { // 2부터 n까지
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j++) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        소수찾기 T = new 소수찾기();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }
}
