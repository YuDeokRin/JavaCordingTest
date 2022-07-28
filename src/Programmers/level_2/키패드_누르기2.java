package Programmers.level_2;

import java.util.Scanner;
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

public class 키패드_누르기2{

    //왼손 오른손을 전역변수로 설정 -> 위치가 계속 바뀌기떄문에 전역변수로
    Position left;
    Position right;
    Position numPos;

    public String solution(int[] numbers, String hand) {
        String answer = "";
        // 1. 왼손, 오른손 초기값 = 손가락 처음 위치
        left = new Position(3, 0);
        right = new Position(3, 2);

        for (int num : numbers) {
            //2. 숫자를 누를 손가락 정하기
            numPos = new Position((num - 1) / 3 , (num - 1) % 3); // 숫자의 위치 계산
            if (num == 0) {
                numPos = new Position(3, 1);
            }

            String finger = numPos.getFinger(hand);

            //3. 정해진 손가락을 answer에 담고 손가락 위치 이동
            answer += finger;
            if (finger.equals("L")) {
                left = numPos;
            }else {
                right = numPos;
            }

        }
        return answer;
    }

    class Position{
        int row;
        int col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public String getFinger(String hand) {
            String finger = hand.equals("right") ? "R" : "L"; // 두 손가락이 위치의 거리가 같을 떄 초기값 본인의 주손으로 맞춰놓음
            if(this.col == 0) finger = "L";
            else if(this.col == 2) finger = "R";
            else{
                int leftDist = left.getDistance(this); //현재의 숫자의 위치(this)와 왼쪽 손가락 위치의  거리
                int rightDist = right.getDistance(this); // 현재의 숫자의 위치(this )와 오른쪽 손가락 위치의  거리

                if(leftDist < rightDist)
                    finger = "L";
                else if (rightDist < leftDist)
                    finger = "R";

            }
            return finger;
        }

        public int getDistance(Position p) {
            //Math.abs(this.row - p.row) 행 간의 차이
            // Math.abs(this.col - p.col) 열 간의 차이
            return Math.abs(this.row - p.row) + Math.abs(this.col - p.col); // 행차이 + 열차이 = 거리
        }

    }

    public static void main(String[] arge) {
        키패드_누르기 T = new 키패드_누르기();
        Scanner in = new Scanner(System.in);
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(T.solution(numbers, hand));
    }
}
