package Programmers.level_0;

import java.util.Arrays;

public class 배열의원소길이 {

    public static void main(String[] args) {
        배열의원소길이 T = new 배열의원소길이();
        String[] str = new String[]{"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(T.solution(str)));
    }


    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }


    // 람다 풀이
    public int[] solution2(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }
}
