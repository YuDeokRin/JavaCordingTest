package Me.StackQueue;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeParenthesisCharacters2 {
    public String solution(String str) {
        String answer ="";
        Pattern p = Pattern.compile("\\)[A-Z]+[A-Z]\\(");
        Matcher m = p.matcher(str);
        System.out.println(m);

        for (char x : str.toCharArray()) {

        }
        return answer;
    }
//    String str = "2020-12-31, 2021/01/03";
//    Pattern p = Pattern.compile("([0-9])+");
//    Matcher m = p.matcher(str);
//    while (m.find()) { System.out.println(m.group());
//                          }
//    출력 2020 12 31 2021 01 03



    public static void main(String[] args) {
        removeParenthesisCharacters2 T = new removeParenthesisCharacters2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
