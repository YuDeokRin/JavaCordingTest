package string01;


import java.util.Scanner;

public class Str06 {
     public String solution(String str){
         String answer = "";
         for (int i =0; i<str.length(); i++){
             //System.out.println(str.charAt(i)+ " " + str.indexOf(str.charAt(i)));
             if (str.indexOf(str.charAt(i))==i) answer+= str.charAt(i);
         }
         return answer;
     }

    public static void main(String[] args) {
        Str06 T = new Str06();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}


