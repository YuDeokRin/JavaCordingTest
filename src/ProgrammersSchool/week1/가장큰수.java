package ProgrammersSchool.week1;

import java.util.Arrays;


public class 가장큰수 {

    public static class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            String[] strArray = new String[numbers.length];

            //정수에서 문자열로 변환
            for (int i = 0; i < strArray.length; i++) {
                strArray[i] = String.valueOf(numbers[i]);
            }

            //내림차순 정렬
            Arrays.sort(strArray, (o1, o2) -> (o2 + o1).compareTo(o1 + o2)); // 6 2 10

            //0이 여러개 있는 배열의 경우  하나만 0으로 리턴
            if (strArray[0].equals("0")) {
                return "0";
            }

            //그 수를 조합한다.
            for (String s : strArray) {
                answer += s;
            }


            return answer;
        }
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[]{6, 10, 2}));

    }


}

