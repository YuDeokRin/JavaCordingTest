package Programmers.level_1;

import java.util.Arrays;
import java.util.Scanner;

public class 로또의_최고_순위와_최저_순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int match = 0;
        for (int x : lottos) {
            if(x == 0) zero++; // 로또의 번호가 0이면 zero++의 수를 올려준다.
            else{
                for (int c : win_nums) { // 맞은 번호하고 x하고 같으면
                    if(x == c){
                        match++;
                        break;
                    }
                }
            }
        }
        int min = match;
        int max = match + zero;

        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};

        return answer;
    }

    public static void main(String[] args) {
        로또의_최고_순위와_최저_순위 T = new 로또의_최고_순위와_최저_순위();
        Scanner in = new Scanner(System.in);
        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(T.solution(lottos, win_nums)));


    }
}
