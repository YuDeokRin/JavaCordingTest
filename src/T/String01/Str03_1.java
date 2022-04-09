package T.String01;

import java.util.Scanner;

public class Str03_1 {
    public String solution(String str ) {
        String answer ="";
        int m = Integer.MIN_VALUE;
        int pos ;
        // inderOf() -> ()안에있는 값이 나오면 인덱스로 리턴, ()값이 없으면 -1 리턴 그리고 while 종료
        while((pos=str.indexOf(' ')) !=-1){
            String tmp = str.substring(0, pos); //0 부터 pos전 까지
            int len  = tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length()>m) {
            answer=str;
        }
        return answer;
    }
    public static void main(String[] args) {
        Str03_1 T = new Str03_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

}
