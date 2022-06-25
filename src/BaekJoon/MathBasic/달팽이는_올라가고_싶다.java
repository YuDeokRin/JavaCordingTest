package BaekJoon.MathBasic;

import java.util.Scanner;

/*
    2869. 달팽이는 올라가고 싶다.

    -문제
    땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
    달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
    달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

    출력)
    첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

    입력 예제)
    2 1 5
    출력 예제)
    4

 */
public class 달팽이는_올라가고_싶다 {
    public int solution(int A, int B, int V) {

        int day = (V - B) / ( A - B);

        if((V - B) % (A - B) != 0){
            day++;
        }

        return day;
    }

    public static void main(String[] args) {
        달팽이는_올라가고_싶다 T = new 달팽이는_올라가고_싶다();
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(); // 낮 올라가는 A미터
        int B = in.nextInt(); // 밤에 내려오는 B미터
        int V = in.nextInt(); // 나무 막대 크기

        System.out.println(T.solution(A, B, V));
    }
}
