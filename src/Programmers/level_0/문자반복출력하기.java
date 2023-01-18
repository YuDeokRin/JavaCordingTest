package Programmers.level_0;

public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();

        for (char c : my_string.toCharArray()) {
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}
