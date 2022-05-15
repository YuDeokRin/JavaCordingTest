package Algorithm_inflearn.Me.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 7. 교육과정 설계
 *
 * 입력값 : CBA
 *        CBDAGE
 */

public class curriculumDesign7 {
    public String solution(String s, String str) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (Character x : s.toCharArray()) {
            Q.offer(x);
        }
        for (char x : str.toCharArray()) {
            if (Q.contains(x)){
                if (x!=Q.poll()){
                    return "NO";
                }
            }
        }
        if (!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        curriculumDesign7 T = new curriculumDesign7();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = sc.next();
        System.out.println(T.solution(s, str));
    }
}
