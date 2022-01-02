package string01;



import java.util.Scanner;

public class Str01 {
    public int solution(String str, char t){
        int answer = 0 ;
        str=str.toUpperCase(); // str이 모두 대문자가 된다.
        t = Character.toUpperCase(t);

        // toCharArray()는 문자배열로 만들어주는 메소드
        for (char  x : str.toCharArray()) {
            if(x ==t ) answer++;
        }

        return answer;

    }
    public static void main(String[] args){
        Str01 T = new Str01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.print(T.solution(str, c));

    }
}