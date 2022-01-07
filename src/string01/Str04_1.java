package string01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Str04_1 {
    public ArrayList<String> solution(int n , String[] str){
        ArrayList<String> answer =new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
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
            String tmp= String.valueOf(s);
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
