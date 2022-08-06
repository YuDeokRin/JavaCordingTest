package Programmers.level_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static Algorithm_inflearn.Me.Sorting_Searching.selectionSort1.solution;

class 폰켓몬Test {
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
    @Test
    public void 확인(){
        Assertions.assertEquals(2, solution(new int[]{3,1,2,3}));
    }

}