package Programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class n배수구하기 {
    public int[] solution(int n, int[] numlist) {

        return Arrays.stream(numlist).filter(value -> value % n ==0).toArray();
    }

//    public ArrayList solution2(int n, int[] numlist) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        for (int num : numlist) {
//            if (num % n == 0) {
//                answer.add(num);
//            }
//        }
//        return answer;
//    }
}
