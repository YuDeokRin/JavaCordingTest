package leetcode;

import java.util.Arrays;
/*
  two sum
 */
public class twosum {
    private int[] solution(int[] nums, int target) {
        int[] answer = new int[2];

        for(int i = 0; i< nums.length; i++){  // 0부터 3까지 (2,7,11,15)
            for (int j = 0; j < nums.length - 1; j++) { //7,11,15
                if(nums[i] + nums[j] == target){
                    answer[0] = j;
                    answer[1] = i;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twosum T = new twosum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(T.solution(nums, target)));
    }
}
