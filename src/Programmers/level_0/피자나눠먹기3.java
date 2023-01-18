package Programmers.level_0;

public class 피자나눠먹기3 {
    public int solution(int slice, int n) { // 7, 10 , = 2
        int answer = 0;

        if (n % slice == 0) {
            answer = n / slice;
        }else{
            answer = n / slice + 1;
        }

        return answer;
    }
}
