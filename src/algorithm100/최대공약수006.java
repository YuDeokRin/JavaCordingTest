package algorithm100;

import java.util.Scanner;

/*
    -문제
    입력된 두 수의 최대공약수 구하기

    입력)
    12 18

    출력)
    6

    최대공약수
    n m을 나누었을 때, 나머지가 0이고 그 중에서 제일 큰수  -> 최대공약수
    n과 m 앞에 것이 더 커야한다..?
    m이 더 크면 n이랑 바꿔준다. big, small
    GCD는 무조건 1부터 시작한다.


 */
public class 최대공약수006 {
    public int solution1(int n, int m) {
        int answer =0;
        //만드는 이유는 n이 더 커야지 최소공배수 구할 수 있는데 m이 더 커버리면 바꿔야하기 때문에 변수를 만들어줌
        int big; // 큰수
        int small; // 작은수


        if(n > m ){ // 앞의 수가 더 클 때
            big = n;
            small = m;
        }else{
            big = m;
            small = n;
        }

        int GCD = 1; // 최대공약수는 무조건 1부터 시작하기때문에 1로 초기화
        //
        for (int i = 1; i <= small; i++) { // 1부터 small까지 i로 나누어지는데 확인하는 for문
            if (big % i == 0 && small % i == 0) { // big도 나누어지고, samll도 나누어지는 수를 확인하는 조건문
               answer=GCD = i; // 처음 -> 1, 2, 3 , 6 순으로 저장 마지막이 최대공약수이다. 그렇기때문에 6이 나온다.
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        최대공약수006 T = new 최대공약수006();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(T.solution1(n,m));
    }
}
