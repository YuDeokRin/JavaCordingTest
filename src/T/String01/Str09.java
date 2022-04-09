package T.String01;

import java.util.Scanner;

//아스키 코드 '0' = 48 , '9'= 57
public class Str09 {
    public int solution(String s){
        int answer = 0;
        for (char x : s.toCharArray()) {
            if(x>=48 && x<=57) answer=answer*10+(x-48);
        }
        return answer;
    }

    public static void main(String[] args) {
        Str09 T = new Str09();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
