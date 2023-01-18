package Programmers.level_0;

public class 머쓱이키큰사람 {
    public static void main(String[] args) {
        머쓱이키큰사람 T = new 머쓱이키큰사람();
        System.out.println(T.solution(new int[]{149, 180, 192, 170}, 167));
    }

    public int solution(int[] array, int height) {
        int answer = 0;

        for(int i = 0 ; i < array.length; i ++){
            if(array[i] > height){
                answer++;
            }
        }
        return answer;
    }
}
