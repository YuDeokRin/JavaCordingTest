package Programmers.level_0;

public class 옹알이1 {
    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;

            for(int i = 0; i<babbling.length; i++){
                babbling[i] = babbling[i].replace("aya", "0");
                babbling[i] = babbling[i].replace("ye", "0");
                babbling[i] = babbling[i].replace("woo", "0");
                babbling[i] = babbling[i].replace("ma", "0");
                babbling[i] = babbling[i].replace("0", "");

                if(babbling[i].isEmpty()){
                    answer = answer + 1;
                }
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution T = new Solution();
//        System.out.println(T.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(T.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
}
