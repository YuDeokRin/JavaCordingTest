package Programmers.level_0;

public class 편지 {
    public int solution(String message) {
        int answer = 0;
        for (char c : message.toCharArray()) {
            answer += 2;
        }
        return answer;
    }



    //간단한 다른 사람풀이
    public int solution2(String message) {
        return message.length() * 2 ;
    }
}
