package Algorithm_inflearn.Me.HashMap_TreeSet;

import java.util.Arrays;
import java.util.Scanner;

//    아나그램 다른방법 1. 정렬을 이용해서 정렬하고 각 비교하기
public class 아나그램2_비교풀이{

    public String solution(String s, String str){
        String answer = "NO";
        //문자열을 문자로 바꾼다.
        char[] arr = s.toCharArray();
        char[] arr2 = str.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);


        if (Arrays.equals(arr, arr2)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args){
        아나그램2_비교풀이 T = new 아나그램2_비교풀이();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String str =in.next();

        System.out.println(T.solution(s,str));

    }
}






