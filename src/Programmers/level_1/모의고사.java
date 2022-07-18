package Programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    모의고사

    -문제
    수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
    수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
    1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

    1번 수포자- 1, 2, 3, 4, 5

    2번 수포자- 2, 1, 2, 3, 2, 4, 2, 5,

    3번 수포자- 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,

    1번이 모든 문제를 맞춤
    입력 : [1,2,3,4,5]
    출력 : [1]

    모든 사람이 2문제 씩 맞춤
    입력 : [1, 3, 2, 4, 2]
    출력 : [1, 2, 3]
 */
public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int answer1 = 0; // 맞은 갯수 저장
        int answer2 = 0; // 맞은 갯수 저장
        int answer3 = 0; // 맞은 갯수 저장

        for (int i = 0; i < answers.length; i++) {
            if(person1[i%person1.length] == answers[i]) answer1++; //if(person1[i%5] == answers[i]) answer1++;
            if(person2[i%person2.length] == answers[i]) answer2++; //if(person2[i%8] == answers[i]) answer2++;
            if(person3[i%person3.length] == answers[i]) answer3++; //if(person3[i%10] == answers[i]) answer3++;
        }

        //비교
        int max = Math.max(Math.max(answer1, answer2), answer3); // 5

        ArrayList<Integer> list = new ArrayList<>();
        if(max == answer1) list.add(1); // 5 == 5 ; 참  -> list에  [1] 넣어줌
        if(max == answer2) list.add(2);
        if(max == answer3) list.add(3);

        answer = new int[list.size()]; // list.size() = 1 이다.

        for (int i = 0; i < answer.length; i++) { //answer.length는  = 1
            answer[i] = list.get(i); // answer[0] = list.get(0) = 1
        }

        return answer;
    }

    public static void main(String[] args) {
        모의고사 T = new 모의고사();
        Scanner in = new Scanner(System.in);
        int[] n = new int[3];
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(T.solution(n)));

    }
}
