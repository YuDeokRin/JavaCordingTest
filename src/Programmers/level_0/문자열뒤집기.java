package Programmers.level_0;

public class 문자열뒤집기 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);

        }
        return answer;
    }


    public String solution2(String my_string) {
        String answer = "";

        StringBuffer sb = new StringBuffer(my_string);
        String reverse = sb.reverse().toString();

        return answer;
    }
}
