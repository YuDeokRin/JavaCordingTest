package Programmers.level_0;

public class 문자열안에문자열 {
    public static void main(String[] args) {
        문자열안에문자열 T = new 문자열안에문자열();
        System.out.println(T.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
    }

    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)){
            answer++;
        }
        return answer;
    }
}
