package ProgrammersSchool.week1;
/*
    문제 : 이분검색(이진탐색)

 */


public class 예산1 {

    public static class Solution {
        public int solution(int[] budgets, int M) {
            int answer = 0;
            int min = 0;
            int max = 0;

            for(int b : budgets){
                max = b;
            }

            while(min <= max){
                int mid = (min + max) /2;

                int sum = 0;
                for (int budget : budgets) {
                    if(budget > mid){
                        sum += mid;
                    }else{
                        sum += budget;
                    }
                }

                if (sum <= M) {
                    min = mid + 1;
                    answer = mid;
                }else{
                    max = mid - 1;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[]{120,110,140,150}, 485));
    }
}
