package BaekJoon;

import java.util.Scanner;


public class Main {
    private String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i) +"---- " + i +  "---- " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i))==i){
                answer = answer + str.charAt(i); // i를 누적해준다.
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}


