package Programmers.level_2;
/*
    Lv1. 키패드 누르기 (카카오 인턴쉽)

    -문제
    https://school.programmers.co.kr/learn/courses/30/lessons/67256
    너무 길어서 링크 참조

    -제한사항
    numbers 배열의 크기는 1 이상 1,000 이하입니다.
    numbers 배열 원소의 값은 0 이상 9 이하인 정수입니다.
    hand는 "left" 또는 "right" 입니다.
    "left"는 왼손잡이, "right"는 오른손잡이를 의미합니다.
    왼손 엄지손가락을 사용한 경우는 L, 오른손 엄지손가락을 사용한 경우는 R을 순서대로 이어붙여 문자열 형태로 return 해주세요.

    -입출력 예제
    numbers	                            hand	    result
    [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	    "LRLLLRLLRRL"
    [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	    "LRLLRRLLLRR"
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	    "right"	    "LLRLLRLLRL"


------풀이
    left       center       right
    1 (0,0)    2 (0,1)      3 (0,2)
    4 (1,0)    5 (1,1)      6 (1,2)
    7 (2,0)    8 (2,1)      9 (2,2)
    10 (3,0)   11 (3,1)    12 (3,2)

    거리구하기 계산
    거리 = |x(input) - y(left의 위치)| / 3 + |x(input) - y(right의 위치)| %3


    1. 오른손, 왼손 초기화

    2. 숫자를 누를 손가락 정하기

    3. 정해진 손가락을 answer에 담고 손가락 위치 이동

 */

import java.util.*;

// 풀이 1. 논리대로 if문 사용해서
public class 키패드_누르기 {


    public  String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10 ; // 왼손 위치 초기화
        int right = 12; // 오른손 위치 초기화


        for(int input : numbers){ // 왼쪽처리
            if(input==1 || input==4 || input ==7 ){
                answer += "L"; // 움직인 기록을 answer에 넣는다.
                left = input; // 누른 지점으로 이동한다.

            } else if (input == 3 || input == 6 || input == 7) { // 오른쪽 처리
                answer += "R"; // 움직인 기록 저장하고
                right = input; // 누른 지점으로 이동한다.

            }else{ // 가운데 처리
                if(input == 0) input = 11;
                int leftDist = Math.abs(input-left)/3 + Math.abs(input-left)%3;
                int rightDist = Math.abs(input - right) / 3 + Math.abs(input - left)%3;

                if (leftDist < rightDist) {
                    answer += 'L';
                    left = input;
                } else if (rightDist < leftDist) {
                    answer += 'R';
                    right = input;
                }else{
                    if (hand.equals("right")) {
                        answer += 'R';
                        right = input;
                    }else{
                        answer += 'L';
                        left = input;
                    }
                }
            }
        }
        return answer;
    }




    public static void main(String[] args) {
        키패드_누르기 T = new 키패드_누르기();
        Scanner in = new Scanner(System.in);
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(T.solution(numbers, hand));

    }
}