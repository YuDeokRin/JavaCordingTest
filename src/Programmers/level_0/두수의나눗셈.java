package Programmers.level_0;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        두수의나눗셈 T = new 두수의나눗셈();

        System.out.println(T.solution(3 , 2));
    }

    public int solution(int num1, int num2) {
        int answer = 0;

        answer = 1000* num1/num2;
        return answer;
    }
}
