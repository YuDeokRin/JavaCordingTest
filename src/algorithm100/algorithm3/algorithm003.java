package algorithm100.algorithm3;

import java.util.ArrayList;
import java.util.Scanner;

/*
    3. 최빈수 구하기

    가장 많이 출현한 수를 최빈수라고 한다.

    입력)
    1 2 2 3 1 4 2 2 4 3
 */
public class algorithm003 {
    public int solution(int[] arr, int n) {
//        ArrayList<Integer> answer = new ArrayList<>();
        int answer = 0; // 최빈수
        int count = 0; // 최빈수가 나온 횟수
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if(count < num[i]){
                count = num[i];
                answer = i;
                //num[1] == 2
                // num[2] == 4
                // num[3] == 2
                // num[4] == 2
            }
        }
        System.out.println("count : " + count);
        return answer;
    }

    public static void main(String[] args) {
        algorithm003 T = new algorithm003();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("최빈수 : " + T.solution(arr , n ));

    }
}
