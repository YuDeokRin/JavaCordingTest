package Programmers.level_0;

public class 양꼬치 {
    public static void main(String[] args) {
        양꼬치 T = new 양꼬치();
        System.out.println(T.solution(10, 3));
    }

    public int solution(int n, int k) {
        return n * 12000 + (k - n /10) * 2000;
    }
}
