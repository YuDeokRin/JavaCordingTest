package SWEA;


import java.util.*;

/**
 * 2056. 연월일 달력
 */

class 연월일달력
{
    public int solution(int n, String s) {
        int daysOfMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        int month = Integer.valueOf(s.substring(4,6));
        int day = Integer.valueOf(s.substring(6,8));
        String res = "-1";
        if(1<=month && month<=12 && 1<=day && day<=daysOfMonth[month-1]){
            res = String .format("%s/%s/%s", s.substring(0,4), s.substring(4,6), s.substring(6,8));

        }
        return 0;
    }

    public static void main(String args[]) throws Exception
    {

        연월일달력 T = new 연월일달력();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(T.solution(n,s));
    }
}



