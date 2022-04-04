package string01;

import java.util.ArrayList;
import java.util.Scanner;

public class Str04_1 {
    public ArrayList<String> solution(int n , String[] str){
        ArrayList<String> answer =new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray(); //toCharArray : char[]로 만들어진다.
                                        // 문자 배열로 만들어서 단어를 쪼개준다.
            int lt = 0;
            int rt = x.length()-1;

            // reverse 바꿔주는 알고리즘
            while(lt<rt){
                char tmp = s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp= String.valueOf(s); // valueof() -> s라는 문자를 String로 변경해준다 .
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Str04_1 T = new Str04_1();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        String[] str = new String[n];

        for (int i=0; i <n; i++){
            str[i] =kb.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
