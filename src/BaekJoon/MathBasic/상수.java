package BaekJoon.MathBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

/*
    2908. 상수

    -문제
    상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
    상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
    상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
    예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
    두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

 */
public class 상수 {
    public ArrayList<String> solution(String[] s) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x  : s){
            String temp = new StringBuilder(x).reverse().toString();

        }
        return answer;
    }

    public static void main(String[] args) {
        상수 T = new 상수();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        n = Integer.parseInt(new StringBuilder().append(n).reverse().toString());
        m = Integer.parseInt(new StringBuilder().append(m).reverse().toString());


        System.out.print(n > m ? n : m); //조건식 ? 반환값1(true) : 반환값2(false)

    }
}
