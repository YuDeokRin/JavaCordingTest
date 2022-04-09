package T.String01;


import java.util.Scanner;

public class Str09_1 {
    public int solution(String s){
        String answer = "";
        for (char x : s.toCharArray()) {
            if(Character.isDigit(x)) {
                answer+=x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Str09_1 T = new Str09_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
