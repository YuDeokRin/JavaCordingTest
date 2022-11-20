package ProgrammersSchool.week1;

import java.util.Arrays;

public class 숫자게임 {

    public int solution2(int[] A, int[] B){
        Arrays.sort(A);
        Arrays.sort(B);
        int index = B.length - 1;

        int answer = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if(A[i] < B[index]){
                index--;
                answer++;
            }
        }

        return answer;
    }

    /*
     테스트는 통과하지만 효율성 검사에서 실패한다.
    효율성 검사
    1. Loop 검사하기

    public int solution(int[] A, int[] B){
        Arrays.sort(B);

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i] < B[j]){
                    answer++;
                    B[j] = 0;
                    break;
                }
            }
        }

        return answer;
    }

     */

    public static void main(String[] args) {
        숫자게임 T = new 숫자게임();
        System.out.println(T.solution2(new int[]{5,1,3,7}, new int[]{2,2,6,8}));
    }
}
