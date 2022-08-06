package Programmers.level_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
    Lv1. 폰켓몬 (해시)

    -문제
    https://school.programmers.co.kr/learn/courses/30/lessons/1845

    입출력 예
    nums	            result
    [3,1,2,3]	           2
    [3,3,3,2,2,4]	       3
    [3,3,3,2,2,2]	       2


    입출력 예 #2
    6마리의 폰켓몬이 있으므로, 3마리의 폰켓몬을 골라야 합니다.
    가장 많은 종류의 폰켓몬을 고르기 위해서는 3번 폰켓몬 한 마리, 2번 폰켓몬 한 마리, 4번 폰켓몬 한 마리를 고르면 되며,
    따라서 3을 return 합니다.

    입출력 예 #3
    6마리의 폰켓몬이 있으므로, 3마리의 폰켓몬을 골라야 합니다.
    가장 많은 종류의 폰켓몬을 고르기 위해서는 3번 폰켓몬 한 마리와 2번 폰켓몬 두 마리를 고르거나, 혹은 3번 폰켓몬 두 마리와 2번 폰켓몬 한 마리를 고르면 됩니다.
    따라서 최대 고를 수 있는 폰켓몬 종류의 수는 2입니다.


 */
public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer=0;
        Set<Integer> set = new HashSet<>();
        int max = nums.length / 2;

        for (int num : nums) {
            set.add(num);
            //[3, 1, 2, 3]
        }


        if(set.size() > max){ // set.size();
            return max; // 2
        }else{
            return set.size(); // 3
        }

    }

    public static void main(String[] args) {
        폰켓몬 T = new 폰켓몬();
        int[] nums = {3,1,2,3};

        System.out.println(T.solution(nums));
    }


}
