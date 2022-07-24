package Programmers.level_1;

import java.util.Scanner;

public class 두_정수_사이의_합 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
            answer += i;
            }
        }else{
            for (int i = b; i <= a; i++) {
                answer +=i;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        두_정수_사이의_합 T = new 두_정수_사이의_합();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(T.solution(a,b));
    }
}
