package Programmers.level_0;

public class 특정문자제거하기 {
    public String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");

        return answer;
    }

    public String solution2(String my_string, String letter) {
        StringBuffer sb = new StringBuffer();

        for (char c : my_string.toCharArray()) {
            if(c != letter.charAt(0)){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
