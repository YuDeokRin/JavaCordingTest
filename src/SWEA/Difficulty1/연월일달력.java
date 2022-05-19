package SWEA.Difficulty1;


import java.util.*;

/**
 * 2056. 연월일 달력
 */

class 연월일달력
{
    public String solution(String s) {
        int daysOfMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        int month = Integer.valueOf(s.substring(4,6)); // month를 잘라서 넣는다.
        int day = Integer.valueOf(s.substring(6,8));
        String res = "-1";
        if(1<=month && month<=12 && 1<=day && day<=daysOfMonth[month-1]){
            res = String.format("%s/%s/%s", s.substring(0,4), s.substring(4,6), s.substring(6,8));
        }
        return res;
    }

    public static void main(String args[]) throws Exception
    {

        연월일달력 T = new 연월일달력();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println("#"+ (i+1) + " "+ T.solution(s[i]));

        }
    }
}



