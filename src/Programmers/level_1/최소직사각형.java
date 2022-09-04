package Programmers.level_1;
/*
    Lv1. 최소직사각형

    https://school.programmers.co.kr/learn/courses/30/lessons/86491

 */
public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;

        int maxWidth = 0;
        int maxVertical = 0;

        for(int i =0; i<sizes.length; i++){
            int a = Math.max(sizes[i][0], sizes[i][1]);
            int b = Math.min(sizes[i][0], sizes[i][1]);

            maxVertical = Math.max(maxVertical, a);
            maxWidth = Math.max(maxWidth, b);
        }
        answer = maxVertical * maxWidth;
        return answer ;
    }

    public static void main(String[] args) {
        최소직사각형 T = new 최소직사각형();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(T.solution(sizes));

    }
}


