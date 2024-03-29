package ProgrammersSchool.week1;

public class 마법의엘베 {

    public static class Solution {
        public int solution(int storey) {
            return elevator(storey);
        }

        private int elevator(int floor) {
            if(floor <= 1) return floor;

            int under10 = floor % 10;
            int rest = floor / 10;

            int c1 = under10 + elevator(rest);
            int c2 = (10 - under10) + elevator(rest + 1);
            return Math.min(c1, c2);
        }
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(16));
    }
}
