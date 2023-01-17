package Programmers.level_0;

import java.util.Scanner;

public class 점의위치구하기2 {

    public int solution(int[] dot){
        int answer = 0;
        if(dot[0] < 0){
            if(dot[1] < 0){
             answer = 3;
            }

            if (dot[1] > 0) {
                answer = 2;
            }
        }

        if(dot[0] > 0){
            if(dot[1] < 0){
                answer = 4;
            }
            if (dot[1] > 0) {
                answer = 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        점의위치구하기 T = new 점의위치구하기();
        int[] n = new int[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            n[i] = sc.nextInt();
        }

        System.out.println(T.solution(n));

    }
}
