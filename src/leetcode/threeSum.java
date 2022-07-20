package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    private List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // i는 0보다 크고 nums[i]와 nums[i+1]이 같으면 다음 칸으로 코드 이동

            left = i + 1;
            right =nums.length -1;

            while(left < right){
                sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if ( sum > 0){
                    right--;
                } else {
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    //중복제거   같은 값을 갖고 잇으면 안되기때문에.
                    while (left < right && nums[left] == nums[left - 1]) {
                        left--;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right++;
                    }
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        threeSum T = new threeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        int a = 0 ;
        System.out.println(Arrays.toString(new List[]{T.solution(nums)}));
    }
}
